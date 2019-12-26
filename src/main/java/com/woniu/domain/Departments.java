package com.woniu.domain;

import java.io.Serializable;

public class Departments implements Serializable {
    private Integer departmentsId;

    private String departmentsName;

    private String departmentsDesc;

    private static final long serialVersionUID = 1L;

    public Integer getDepartmentsId() {
        return departmentsId;
    }

    public void setDepartmentsId(Integer departmentsId) {
        this.departmentsId = departmentsId;
    }

    public String getDepartmentsName() {
        return departmentsName;
    }

    public void setDepartmentsName(String departmentsName) {
        this.departmentsName = departmentsName == null ? null : departmentsName.trim();
    }

    public String getDepartmentsDesc() {
        return departmentsDesc;
    }

    public void setDepartmentsDesc(String departmentsDesc) {
        this.departmentsDesc = departmentsDesc == null ? null : departmentsDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", departmentsId=").append(departmentsId);
        sb.append(", departmentsName=").append(departmentsName);
        sb.append(", departmentsDesc=").append(departmentsDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}