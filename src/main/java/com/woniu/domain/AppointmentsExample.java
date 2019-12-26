package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppointmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAppointmentsIdIsNull() {
            addCriterion("appointments_id is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdIsNotNull() {
            addCriterion("appointments_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdEqualTo(Integer value) {
            addCriterion("appointments_id =", value, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdNotEqualTo(Integer value) {
            addCriterion("appointments_id <>", value, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdGreaterThan(Integer value) {
            addCriterion("appointments_id >", value, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointments_id >=", value, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdLessThan(Integer value) {
            addCriterion("appointments_id <", value, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("appointments_id <=", value, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdIn(List<Integer> values) {
            addCriterion("appointments_id in", values, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdNotIn(List<Integer> values) {
            addCriterion("appointments_id not in", values, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdBetween(Integer value1, Integer value2) {
            addCriterion("appointments_id between", value1, value2, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appointments_id not between", value1, value2, "appointmentsId");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateIsNull() {
            addCriterion("appointments_date is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateIsNotNull() {
            addCriterion("appointments_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateEqualTo(Date value) {
            addCriterionForJDBCDate("appointments_date =", value, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("appointments_date <>", value, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("appointments_date >", value, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("appointments_date >=", value, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateLessThan(Date value) {
            addCriterionForJDBCDate("appointments_date <", value, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("appointments_date <=", value, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateIn(List<Date> values) {
            addCriterionForJDBCDate("appointments_date in", values, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("appointments_date not in", values, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("appointments_date between", value1, value2, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("appointments_date not between", value1, value2, "appointmentsDate");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusIsNull() {
            addCriterion("appointments_status is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusIsNotNull() {
            addCriterion("appointments_status is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusEqualTo(String value) {
            addCriterion("appointments_status =", value, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusNotEqualTo(String value) {
            addCriterion("appointments_status <>", value, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusGreaterThan(String value) {
            addCriterion("appointments_status >", value, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("appointments_status >=", value, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusLessThan(String value) {
            addCriterion("appointments_status <", value, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusLessThanOrEqualTo(String value) {
            addCriterion("appointments_status <=", value, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusLike(String value) {
            addCriterion("appointments_status like", value, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusNotLike(String value) {
            addCriterion("appointments_status not like", value, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusIn(List<String> values) {
            addCriterion("appointments_status in", values, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusNotIn(List<String> values) {
            addCriterion("appointments_status not in", values, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusBetween(String value1, String value2) {
            addCriterion("appointments_status between", value1, value2, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andAppointmentsStatusNotBetween(String value1, String value2) {
            addCriterion("appointments_status not between", value1, value2, "appointmentsStatus");
            return (Criteria) this;
        }

        public Criteria andPatientsIdIsNull() {
            addCriterion("patients_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientsIdIsNotNull() {
            addCriterion("patients_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientsIdEqualTo(Integer value) {
            addCriterion("patients_id =", value, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdNotEqualTo(Integer value) {
            addCriterion("patients_id <>", value, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdGreaterThan(Integer value) {
            addCriterion("patients_id >", value, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patients_id >=", value, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdLessThan(Integer value) {
            addCriterion("patients_id <", value, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdLessThanOrEqualTo(Integer value) {
            addCriterion("patients_id <=", value, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdIn(List<Integer> values) {
            addCriterion("patients_id in", values, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdNotIn(List<Integer> values) {
            addCriterion("patients_id not in", values, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdBetween(Integer value1, Integer value2) {
            addCriterion("patients_id between", value1, value2, "patientsId");
            return (Criteria) this;
        }

        public Criteria andPatientsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patients_id not between", value1, value2, "patientsId");
            return (Criteria) this;
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