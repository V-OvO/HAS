package com.woniu.domain;

import java.io.Serializable;

public class Patients implements Serializable {
    private Integer patientsId;

    private String patientsName;

    private String patientsPhone;

    private String patientsIdcard;

    private Integer patientsCredit;

    private Integer rolesId;

    private static final long serialVersionUID = 1L;

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public String getPatientsName() {
        return patientsName;
    }

    public void setPatientsName(String patientsName) {
        this.patientsName = patientsName == null ? null : patientsName.trim();
    }

    public String getPatientsPhone() {
        return patientsPhone;
    }

    public void setPatientsPhone(String patientsPhone) {
        this.patientsPhone = patientsPhone == null ? null : patientsPhone.trim();
    }

    public String getPatientsIdcard() {
        return patientsIdcard;
    }

    public void setPatientsIdcard(String patientsIdcard) {
        this.patientsIdcard = patientsIdcard == null ? null : patientsIdcard.trim();
    }

    public Integer getPatientsCredit() {
        return patientsCredit;
    }

    public void setPatientsCredit(Integer patientsCredit) {
        this.patientsCredit = patientsCredit;
    }

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientsId=").append(patientsId);
        sb.append(", patientsName=").append(patientsName);
        sb.append(", patientsPhone=").append(patientsPhone);
        sb.append(", patientsIdcard=").append(patientsIdcard);
        sb.append(", patientsCredit=").append(patientsCredit);
        sb.append(", rolesId=").append(rolesId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}