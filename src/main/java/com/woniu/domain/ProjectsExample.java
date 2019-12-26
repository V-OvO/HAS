package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class ProjectsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectsExample() {
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

        public Criteria andProjectsNameIsNull() {
            addCriterion("projects_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectsNameIsNotNull() {
            addCriterion("projects_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectsNameEqualTo(String value) {
            addCriterion("projects_name =", value, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameNotEqualTo(String value) {
            addCriterion("projects_name <>", value, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameGreaterThan(String value) {
            addCriterion("projects_name >", value, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameGreaterThanOrEqualTo(String value) {
            addCriterion("projects_name >=", value, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameLessThan(String value) {
            addCriterion("projects_name <", value, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameLessThanOrEqualTo(String value) {
            addCriterion("projects_name <=", value, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameLike(String value) {
            addCriterion("projects_name like", value, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameNotLike(String value) {
            addCriterion("projects_name not like", value, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameIn(List<String> values) {
            addCriterion("projects_name in", values, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameNotIn(List<String> values) {
            addCriterion("projects_name not in", values, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameBetween(String value1, String value2) {
            addCriterion("projects_name between", value1, value2, "projectsName");
            return (Criteria) this;
        }

        public Criteria andProjectsNameNotBetween(String value1, String value2) {
            addCriterion("projects_name not between", value1, value2, "projectsName");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdIsNull() {
            addCriterion("departments_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdIsNotNull() {
            addCriterion("departments_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdEqualTo(Integer value) {
            addCriterion("departments_id =", value, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdNotEqualTo(Integer value) {
            addCriterion("departments_id <>", value, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdGreaterThan(Integer value) {
            addCriterion("departments_id >", value, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("departments_id >=", value, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdLessThan(Integer value) {
            addCriterion("departments_id <", value, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("departments_id <=", value, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdIn(List<Integer> values) {
            addCriterion("departments_id in", values, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdNotIn(List<Integer> values) {
            addCriterion("departments_id not in", values, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdBetween(Integer value1, Integer value2) {
            addCriterion("departments_id between", value1, value2, "departmentsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("departments_id not between", value1, value2, "departmentsId");
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