package com.woniu.domain;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer usersId;

    private String usersNumber;

    private String usersPassword;

    private String salt;

    private static final long serialVersionUID = 1L;

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersNumber() {
        return usersNumber;
    }

    public void setUsersNumber(String usersNumber) {
        this.usersNumber = usersNumber == null ? null : usersNumber.trim();
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword == null ? null : usersPassword.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usersId=").append(usersId);
        sb.append(", usersNumber=").append(usersNumber);
        sb.append(", usersPassword=").append(usersPassword);
        sb.append(", salt=").append(salt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}