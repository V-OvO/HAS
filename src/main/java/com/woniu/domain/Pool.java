package com.woniu.domain;

import java.io.Serializable;

public class Pool implements Serializable {
    private Integer poolId;

    private Integer poolResidue;

    private Integer schedulingsId;

    private static final long serialVersionUID = 1L;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Integer getPoolResidue() {
        return poolResidue;
    }

    public void setPoolResidue(Integer poolResidue) {
        this.poolResidue = poolResidue;
    }

    public Integer getSchedulingsId() {
        return schedulingsId;
    }

    public void setSchedulingsId(Integer schedulingsId) {
        this.schedulingsId = schedulingsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", poolId=").append(poolId);
        sb.append(", poolResidue=").append(poolResidue);
        sb.append(", schedulingsId=").append(schedulingsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}