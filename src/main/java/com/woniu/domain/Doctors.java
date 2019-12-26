package com.woniu.domain;

import java.io.Serializable;

public class Doctors implements Serializable {
    private Integer doctorsId;

    private Integer diagnoseroomsId;

    private String doctorsName;

    private String doctorsPhoto;

    private String doctorsDesc;

    private static final long serialVersionUID = 1L;

    public Integer getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(Integer doctorsId) {
        this.doctorsId = doctorsId;
    }

    public Integer getDiagnoseroomsId() {
        return diagnoseroomsId;
    }

    public void setDiagnoseroomsId(Integer diagnoseroomsId) {
        this.diagnoseroomsId = diagnoseroomsId;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName == null ? null : doctorsName.trim();
    }

    public String getDoctorsPhoto() {
        return doctorsPhoto;
    }

    public void setDoctorsPhoto(String doctorsPhoto) {
        this.doctorsPhoto = doctorsPhoto == null ? null : doctorsPhoto.trim();
    }

    public String getDoctorsDesc() {
        return doctorsDesc;
    }

    public void setDoctorsDesc(String doctorsDesc) {
        this.doctorsDesc = doctorsDesc == null ? null : doctorsDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorsId=").append(doctorsId);
        sb.append(", diagnoseroomsId=").append(diagnoseroomsId);
        sb.append(", doctorsName=").append(doctorsName);
        sb.append(", doctorsPhoto=").append(doctorsPhoto);
        sb.append(", doctorsDesc=").append(doctorsDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}