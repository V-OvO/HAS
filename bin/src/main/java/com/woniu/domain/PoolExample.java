package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class PoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoolExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPoolIdIsNull() {
            addCriterion("pool_id is null");
            return (Criteria) this;
        }

        public Criteria andPoolIdIsNotNull() {
            addCriterion("pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoolIdEqualTo(Integer value) {
            addCriterion("pool_id =", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotEqualTo(Integer value) {
            addCriterion("pool_id <>", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdGreaterThan(Integer value) {
            addCriterion("pool_id >", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pool_id >=", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLessThan(Integer value) {
            addCriterion("pool_id <", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("pool_id <=", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdIn(List<Integer> values) {
            addCriterion("pool_id in", values, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotIn(List<Integer> values) {
            addCriterion("pool_id not in", values, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdBetween(Integer value1, Integer value2) {
            addCriterion("pool_id between", value1, value2, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pool_id not between", value1, value2, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolResidueIsNull() {
            addCriterion("pool_residue is null");
            return (Criteria) this;
        }

        public Criteria andPoolResidueIsNotNull() {
            addCriterion("pool_residue is not null");
            return (Criteria) this;
        }

        public Criteria andPoolResidueEqualTo(Integer value) {
            addCriterion("pool_residue =", value, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueNotEqualTo(Integer value) {
            addCriterion("pool_residue <>", value, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueGreaterThan(Integer value) {
            addCriterion("pool_residue >", value, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueGreaterThanOrEqualTo(Integer value) {
            addCriterion("pool_residue >=", value, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueLessThan(Integer value) {
            addCriterion("pool_residue <", value, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueLessThanOrEqualTo(Integer value) {
            addCriterion("pool_residue <=", value, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueIn(List<Integer> values) {
            addCriterion("pool_residue in", values, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueNotIn(List<Integer> values) {
            addCriterion("pool_residue not in", values, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueBetween(Integer value1, Integer value2) {
            addCriterion("pool_residue between", value1, value2, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andPoolResidueNotBetween(Integer value1, Integer value2) {
            addCriterion("pool_residue not between", value1, value2, "poolResidue");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdIsNull() {
            addCriterion("schedulings_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdIsNotNull() {
            addCriterion("schedulings_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdEqualTo(Integer value) {
            addCriterion("schedulings_id =", value, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdNotEqualTo(Integer value) {
            addCriterion("schedulings_id <>", value, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdGreaterThan(Integer value) {
            addCriterion("schedulings_id >", value, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedulings_id >=", value, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdLessThan(Integer value) {
            addCriterion("schedulings_id <", value, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdLessThanOrEqualTo(Integer value) {
            addCriterion("schedulings_id <=", value, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdIn(List<Integer> values) {
            addCriterion("schedulings_id in", values, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdNotIn(List<Integer> values) {
            addCriterion("schedulings_id not in", values, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdBetween(Integer value1, Integer value2) {
            addCriterion("schedulings_id between", value1, value2, "schedulingsId");
            return (Criteria) this;
        }

        public Criteria andSchedulingsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schedulings_id not between", value1, value2, "schedulingsId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}