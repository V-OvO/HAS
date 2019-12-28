package com.woniu.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

//用来代替spring-servlet.xml
@Configuration
public class RootConfig {

	// 配置数据源
	@Bean
	public DruidDataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/has?characterEncoding=utf8");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

	// 配置加盐加密
	@Bean
	public HashedCredentialsMatcher hcm() {
		HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
		hcm.setHashAlgorithmName("md5");
		hcm.setHashIterations(1024);
		return hcm;
	}

	// 配置realm
	@Bean
	public JdbcRealm realm() {
		JdbcRealm realm = new JdbcRealm();
		realm.setDataSource(dataSource());
		// 验证登录
		realm.setAuthenticationQuery("select users_password,salt from users where users_number = ?");
		// 根据账号查角色
		realm.setUserRolesQuery(
				"SELECT roles_name FROM users_roles ur JOIN users u on ur.`users_id` = u.`users_id` JOIN roles r ON ur.`roles_id` = r.`roles_id` WHERE users_number = ?");
		// 根据角色查权限
		realm.setPermissionsQuery(
				"SELECT permission_name FROM roles_permissions rp JOIN roles r ON rp.`roles_id`=r.`roles_id` JOIN permissions p ON rp.`permissions_id`=p.`permissions_id` WHERE roles_name = ？");
		// 允许角色查权限
		realm.setPermissionsLookupEnabled(true);
		realm.setCredentialsMatcher(hcm());
		realm.setSaltStyle(SaltStyle.COLUMN);
		return realm;
	}

	// 配置安全管理器
	@Bean
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		return securityManager;
	}

	// 配置路径
	// 容器并没有把ShiroFilterFactoryBean本身的实例放入容器中，而是把ShiroFilterFactoryBean的getObject方法所返回的对象放入容器中！
	// ShiroFilterFactoryBean的getObject()方法返回的就是ShiroFilter！！
	// 一旦给ShiroFilter注入了SecurityManager，那么ShiroFilter就会把SecurityManager设置为全局的！
	// 我们在开发时，就可以使用使用SecurityUtils.getSubject()来获取主体了！
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		// 设置登录界面
		shiroFilter.setLoginUrl("/admin/login.jsp");
		// 设置没权限跳转界面
		shiroFilter.setUnauthorizedUrl("/admin/unauthorized.jsp");
		// 设置安全管理器
		shiroFilter.setSecurityManager(securityManager());

		Map<String, String> map = new HashMap<>();
		map.put("/logout", "logout");
		map.put("/admin/login.jsp", "anon");
		map.put("/users/login", "anon");
		map.put("/js/**", "anon");
		map.put("/**", "authc");

		shiroFilter.setFilterChainDefinitionMap(map);

		return shiroFilter;
	}

	// 开启shiro权限注解
	@Bean
	public AuthorizationAttributeSourceAdvisor aasa() {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(securityManager());
		return aasa;
	}

}
