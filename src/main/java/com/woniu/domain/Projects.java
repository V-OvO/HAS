package com.woniu.domain;

import java.io.Serializable;

public class Projects implements Serializable {
    private Integer projectsId;

    private String projectsName;

    private Integer departmentsId;

    private static final long serialVersionUID = 1L;

    public Integer getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(Integer projectsId) {
        this.projectsId = projectsId;
    }

    public String getProjectsName() {
        return projectsName;
    }

    public void setProjectsName(String projectsName) {
        this.projectsName = projectsName == null ? null : projectsName.trim();
    }

    public Integer getDepartmentsId() {
        return departmentsId;
    }

    public void setDepartmentsId(Integer departmentsId) {
        this.departmentsId = departmentsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectsId=").append(projectsId);
        sb.append(", projectsName=").append(projectsName);
        sb.append(", departmentsId=").append(departmentsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}