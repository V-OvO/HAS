package com.woniu.domain;

import java.io.Serializable;
import java.util.List;

public class Permissions implements Serializable {
	private Integer permissionsId;

	private String permissionName;

	private Integer parentid;

	private String url;

	private String permissionsDesc;

	private List<Permissions> children;

	private static final long serialVersionUID = 1L;

	public List<Permissions> getChildren() {
		return children;
	}

	public void setChildren(List<Permissions> children) {
		this.children = children;
	}

	public Integer getPermissionsId() {
		return permissionsId;
	}

	public void setPermissionsId(Integer permissionsId) {
		this.permissionsId = permissionsId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName == null ? null : permissionName.trim();
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public String getPermissionsDesc() {
		return permissionsDesc;
	}

	public void setPermissionsDesc(String permissionsDesc) {
		this.permissionsDesc = permissionsDesc == null ? null : permissionsDesc.trim();
	}

	@Override
	public String toString() {
		return "Permissions [permissionsId=" + permissionsId + ", permissionName=" + permissionName + ", parentid="
				+ parentid + ", url=" + url + ", permissionsDesc=" + permissionsDesc + ", children=" + children + "]";
	}

}