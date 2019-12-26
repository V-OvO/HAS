package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Appointments implements Serializable {
    private Integer appointmentsId;

    private Date appointmentsDate;

    private String appointmentsStatus;

    private Integer patientsId;

    private Integer poolId;

    private static final long serialVersionUID = 1L;

    public Integer getAppointmentsId() {
        return appointmentsId;
    }

    public void setAppointmentsId(Integer appointmentsId) {
        this.appointmentsId = appointmentsId;
    }

    public Date getAppointmentsDate() {
        return appointmentsDate;
    }

    public void setAppointmentsDate(Date appointmentsDate) {
        this.appointmentsDate = appointmentsDate;
    }

    public String getAppointmentsStatus() {
        return appointmentsStatus;
    }

    public void setAppointmentsStatus(String appointmentsStatus) {
        this.appointmentsStatus = appointmentsStatus == null ? null : appointmentsStatus.trim();
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appointmentsId=").append(appointmentsId);
        sb.append(", appointmentsDate=").append(appointmentsDate);
        sb.append(", appointmentsStatus=").append(appointmentsStatus);
        sb.append(", patientsId=").append(patientsId);
        sb.append(", poolId=").append(poolId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}