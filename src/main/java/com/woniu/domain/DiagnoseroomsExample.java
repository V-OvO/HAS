package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class DiagnoseroomsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiagnoseroomsExample() {
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

        public Criteria andDiagnoseroomsIdIsNull() {
            addCriterion("diagnoserooms_id is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdIsNotNull() {
            addCriterion("diagnoserooms_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdEqualTo(Integer value) {
            addCriterion("diagnoserooms_id =", value, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdNotEqualTo(Integer value) {
            addCriterion("diagnoserooms_id <>", value, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdGreaterThan(Integer value) {
            addCriterion("diagnoserooms_id >", value, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("diagnoserooms_id >=", value, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdLessThan(Integer value) {
            addCriterion("diagnoserooms_id <", value, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdLessThanOrEqualTo(Integer value) {
            addCriterion("diagnoserooms_id <=", value, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdIn(List<Integer> values) {
            addCriterion("diagnoserooms_id in", values, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdNotIn(List<Integer> values) {
            addCriterion("diagnoserooms_id not in", values, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdBetween(Integer value1, Integer value2) {
            addCriterion("diagnoserooms_id between", value1, value2, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("diagnoserooms_id not between", value1, value2, "diagnoseroomsId");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameIsNull() {
            addCriterion("diagnoserooms_name is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameIsNotNull() {
            addCriterion("diagnoserooms_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameEqualTo(String value) {
            addCriterion("diagnoserooms_name =", value, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameNotEqualTo(String value) {
            addCriterion("diagnoserooms_name <>", value, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameGreaterThan(String value) {
            addCriterion("diagnoserooms_name >", value, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameGreaterThanOrEqualTo(String value) {
            addCriterion("diagnoserooms_name >=", value, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameLessThan(String value) {
            addCriterion("diagnoserooms_name <", value, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameLessThanOrEqualTo(String value) {
            addCriterion("diagnoserooms_name <=", value, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameLike(String value) {
            addCriterion("diagnoserooms_name like", value, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameNotLike(String value) {
            addCriterion("diagnoserooms_name not like", value, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameIn(List<String> values) {
            addCriterion("diagnoserooms_name in", values, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameNotIn(List<String> values) {
            addCriterion("diagnoserooms_name not in", values, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameBetween(String value1, String value2) {
            addCriterion("diagnoserooms_name between", value1, value2, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andDiagnoseroomsNameNotBetween(String value1, String value2) {
            addCriterion("diagnoserooms_name not between", value1, value2, "diagnoseroomsName");
            return (Criteria) this;
        }

        public Criteria andProjectsIdIsNull() {
            addCriterion("projects_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectsIdIsNotNull() {
            addCriterion("projects_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectsIdEqualTo(Integer value) {
            addCriterion("projects_id =", value, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdNotEqualTo(Integer value) {
            addCriterion("projects_id <>", value, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdGreaterThan(Integer value) {
            addCriterion("projects_id >", value, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("projects_id >=", value, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdLessThan(Integer value) {
            addCriterion("projects_id <", value, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdLessThanOrEqualTo(Integer value) {
            addCriterion("projects_id <=", value, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdIn(List<Integer> values) {
            addCriterion("projects_id in", values, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdNotIn(List<Integer> values) {
            addCriterion("projects_id not in", values, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdBetween(Integer value1, Integer value2) {
            addCriterion("projects_id between", value1, value2, "projectsId");
            return (Criteria) this;
        }

        public Criteria andProjectsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("projects_id not between", value1, value2, "projectsId");
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