package com.woniu.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.woniu")
//@MapperScan专门用来扫描各种Mapper，只需要扫到Mapper接口即可
//比如扫描到了PermissionsMapper这个接口，该注解处理器就会使用动态代理自动创建PermissionsMapper的实现类
//PermissionsMapper的实现类是根据PermissionsMapper.xml生成的！ 再把该实现类的对象实例化出来，再把对象放入spring ioc容器中
//最终，spring ioc容器中就有一个PermissionsMapper接口的实现类的实例！
@MapperScan("com.woniu.dao")
public class App {
	public static void main(String[] args) {
		/*
		 * 启动SpringBoot应用
		 * 1.启动内置tomcat，默认端口为8080
		 * 2.把当前应用部署到内置tomcat中，且部署的名字叫root
		 * 3.部署应用的时候，会创建DiapatcherServlet
		 * 4.创建DispatcherServlet的时候，DispatcherServlet还会创建Spring ioc容器，且把这个容器存入application范围中。
		 * 5.创建Spring ioc容器的时候，还会扫包，扫包的时候，就能管理哪些有特定注解的类的对象：@Service @Repository @Controller @Component
		 * 
		 * 注意：springboot项目，默认的视图解析器不是加前后缀的那个解析器，为了让springboot项目使用加前后缀的视图解析器，就需要配置：
		 */
		SpringApplication.run(App.class, args);
	}
}
