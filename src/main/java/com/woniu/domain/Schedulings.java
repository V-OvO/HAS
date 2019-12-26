package com.woniu.domain;

import java.io.Serializable;
import java.util.Date;

public class Schedulings implements Serializable {
    private Integer schedulingsId;

    private Date schedulingsDate;

    private Date schedulingsStarttime;

    private Date schedulingsEndtime;

    private Integer doctorsId;

    private static final long serialVersionUID = 1L;

    public Integer getSchedulingsId() {
        return schedulingsId;
    }

    public void setSchedulingsId(Integer schedulingsId) {
        this.schedulingsId = schedulingsId;
    }

    public Date getSchedulingsDate() {
        return schedulingsDate;
    }

    public void setSchedulingsDate(Date schedulingsDate) {
        this.schedulingsDate = schedulingsDate;
    }

    public Date getSchedulingsStarttime() {
        return schedulingsStarttime;
    }

    public void setSchedulingsStarttime(Date schedulingsStarttime) {
        this.schedulingsStarttime = schedulingsStarttime;
    }

    public Date getSchedulingsEndtime() {
        return schedulingsEndtime;
    }

    public void setSchedulingsEndtime(Date schedulingsEndtime) {
        this.schedulingsEndtime = schedulingsEndtime;
    }

    public Integer getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(Integer doctorsId) {
        this.doctorsId = doctorsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schedulingsId=").append(schedulingsId);
        sb.append(", schedulingsDate=").append(schedulingsDate);
        sb.append(", schedulingsStarttime=").append(schedulingsStarttime);
        sb.append(", schedulingsEndtime=").append(schedulingsEndtime);
        sb.append(", doctorsId=").append(doctorsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}