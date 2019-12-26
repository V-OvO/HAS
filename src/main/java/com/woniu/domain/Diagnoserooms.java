package com.woniu.domain;

import java.io.Serializable;

public class Diagnoserooms implements Serializable {
    private Integer diagnoseroomsId;

    private String diagnoseroomsName;

    private Integer projectsId;

    private static final long serialVersionUID = 1L;

    public Integer getDiagnoseroomsId() {
        return diagnoseroomsId;
    }

    public void setDiagnoseroomsId(Integer diagnoseroomsId) {
        this.diagnoseroomsId = diagnoseroomsId;
    }

    public String getDiagnoseroomsName() {
        return diagnoseroomsName;
    }

    public void setDiagnoseroomsName(String diagnoseroomsName) {
        this.diagnoseroomsName = diagnoseroomsName == null ? null : diagnoseroomsName.trim();
    }

    public Integer getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(Integer projectsId) {
        this.projectsId = projectsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", diagnoseroomsId=").append(diagnoseroomsId);
        sb.append(", diagnoseroomsName=").append(diagnoseroomsName);
        sb.append(", projectsId=").append(projectsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}