package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchedulingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingsExample() {
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

        public Criteria andSchedulingsDateIsNull() {
            addCriterion("schedulings_date is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateIsNotNull() {
            addCriterion("schedulings_date is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_date =", value, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_date <>", value, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("schedulings_date >", value, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_date >=", value, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateLessThan(Date value) {
            addCriterionForJDBCDate("schedulings_date <", value, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_date <=", value, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateIn(List<Date> values) {
            addCriterionForJDBCDate("schedulings_date in", values, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("schedulings_date not in", values, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedulings_date between", value1, value2, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedulings_date not between", value1, value2, "schedulingsDate");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeIsNull() {
            addCriterion("schedulings_starttime is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeIsNotNull() {
            addCriterion("schedulings_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_starttime =", value, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_starttime <>", value, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("schedulings_starttime >", value, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_starttime >=", value, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("schedulings_starttime <", value, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_starttime <=", value, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("schedulings_starttime in", values, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("schedulings_starttime not in", values, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedulings_starttime between", value1, value2, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedulings_starttime not between", value1, value2, "schedulingsStarttime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeIsNull() {
            addCriterion("schedulings_endtime is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeIsNotNull() {
            addCriterion("schedulings_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_endtime =", value, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_endtime <>", value, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("schedulings_endtime >", value, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_endtime >=", value, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("schedulings_endtime <", value, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("schedulings_endtime <=", value, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("schedulings_endtime in", values, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("schedulings_endtime not in", values, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedulings_endtime between", value1, value2, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andSchedulingsEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("schedulings_endtime not between", value1, value2, "schedulingsEndtime");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdIsNull() {
            addCriterion("doctors_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdIsNotNull() {
            addCriterion("doctors_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdEqualTo(Integer value) {
            addCriterion("doctors_id =", value, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdNotEqualTo(Integer value) {
            addCriterion("doctors_id <>", value, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdGreaterThan(Integer value) {
            addCriterion("doctors_id >", value, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctors_id >=", value, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdLessThan(Integer value) {
            addCriterion("doctors_id <", value, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctors_id <=", value, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdIn(List<Integer> values) {
            addCriterion("doctors_id in", values, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdNotIn(List<Integer> values) {
            addCriterion("doctors_id not in", values, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdBetween(Integer value1, Integer value2) {
            addCriterion("doctors_id between", value1, value2, "doctorsId");
            return (Criteria) this;
        }

        public Criteria andDoctorsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctors_id not between", value1, value2, "doctorsId");
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