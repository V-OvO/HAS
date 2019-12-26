package com.woniu.domain;

import java.io.Serializable;

public class Teams implements Serializable {
    private Integer teamsId;

    private String teamsName;

    private Integer appointmentsId;

    private static final long serialVersionUID = 1L;

    public Integer getTeamsId() {
        return teamsId;
    }

    public void setTeamsId(Integer teamsId) {
        this.teamsId = teamsId;
    }

    public String getTeamsName() {
        return teamsName;
    }

    public void setTeamsName(String teamsName) {
        this.teamsName = teamsName == null ? null : teamsName.trim();
    }

    public Integer getAppointmentsId() {
        return appointmentsId;
    }

    public void setAppointmentsId(Integer appointmentsId) {
        this.appointmentsId = appointmentsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teamsId=").append(teamsId);
        sb.append(", teamsName=").append(teamsName);
        sb.append(", appointmentsId=").append(appointmentsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}