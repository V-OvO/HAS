package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class TeamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamsExample() {
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

        public Criteria andTeamsIdIsNull() {
            addCriterion("teams_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamsIdIsNotNull() {
            addCriterion("teams_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamsIdEqualTo(Integer value) {
            addCriterion("teams_id =", value, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdNotEqualTo(Integer value) {
            addCriterion("teams_id <>", value, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdGreaterThan(Integer value) {
            addCriterion("teams_id >", value, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teams_id >=", value, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdLessThan(Integer value) {
            addCriterion("teams_id <", value, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdLessThanOrEqualTo(Integer value) {
            addCriterion("teams_id <=", value, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdIn(List<Integer> values) {
            addCriterion("teams_id in", values, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdNotIn(List<Integer> values) {
            addCriterion("teams_id not in", values, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdBetween(Integer value1, Integer value2) {
            addCriterion("teams_id between", value1, value2, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teams_id not between", value1, value2, "teamsId");
            return (Criteria) this;
        }

        public Criteria andTeamsNameIsNull() {
            addCriterion("teams_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamsNameIsNotNull() {
            addCriterion("teams_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamsNameEqualTo(String value) {
            addCriterion("teams_name =", value, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameNotEqualTo(String value) {
            addCriterion("teams_name <>", value, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameGreaterThan(String value) {
            addCriterion("teams_name >", value, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameGreaterThanOrEqualTo(String value) {
            addCriterion("teams_name >=", value, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameLessThan(String value) {
            addCriterion("teams_name <", value, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameLessThanOrEqualTo(String value) {
            addCriterion("teams_name <=", value, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameLike(String value) {
            addCriterion("teams_name like", value, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameNotLike(String value) {
            addCriterion("teams_name not like", value, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameIn(List<String> values) {
            addCriterion("teams_name in", values, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameNotIn(List<String> values) {
            addCriterion("teams_name not in", values, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameBetween(String value1, String value2) {
            addCriterion("teams_name between", value1, value2, "teamsName");
            return (Criteria) this;
        }

        public Criteria andTeamsNameNotBetween(String value1, String value2) {
            addCriterion("teams_name not between", value1, value2, "teamsName");
            return (Criteria) this;
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