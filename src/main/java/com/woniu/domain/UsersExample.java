package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUsersIdIsNull() {
            addCriterion("users_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Integer value) {
            addCriterion("users_id =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Integer value) {
            addCriterion("users_id <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Integer value) {
            addCriterion("users_id >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_id >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Integer value) {
            addCriterion("users_id <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("users_id <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Integer> values) {
            addCriterion("users_id in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Integer> values) {
            addCriterion("users_id not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("users_id between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("users_id not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersNumberIsNull() {
            addCriterion("users_number is null");
            return (Criteria) this;
        }

        public Criteria andUsersNumberIsNotNull() {
            addCriterion("users_number is not null");
            return (Criteria) this;
        }

        public Criteria andUsersNumberEqualTo(String value) {
            addCriterion("users_number =", value, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberNotEqualTo(String value) {
            addCriterion("users_number <>", value, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberGreaterThan(String value) {
            addCriterion("users_number >", value, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberGreaterThanOrEqualTo(String value) {
            addCriterion("users_number >=", value, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberLessThan(String value) {
            addCriterion("users_number <", value, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberLessThanOrEqualTo(String value) {
            addCriterion("users_number <=", value, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberLike(String value) {
            addCriterion("users_number like", value, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberNotLike(String value) {
            addCriterion("users_number not like", value, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberIn(List<String> values) {
            addCriterion("users_number in", values, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberNotIn(List<String> values) {
            addCriterion("users_number not in", values, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberBetween(String value1, String value2) {
            addCriterion("users_number between", value1, value2, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersNumberNotBetween(String value1, String value2) {
            addCriterion("users_number not between", value1, value2, "usersNumber");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIsNull() {
            addCriterion("users_password is null");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIsNotNull() {
            addCriterion("users_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordEqualTo(String value) {
            addCriterion("users_password =", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotEqualTo(String value) {
            addCriterion("users_password <>", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordGreaterThan(String value) {
            addCriterion("users_password >", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("users_password >=", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLessThan(String value) {
            addCriterion("users_password <", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLessThanOrEqualTo(String value) {
            addCriterion("users_password <=", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordLike(String value) {
            addCriterion("users_password like", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotLike(String value) {
            addCriterion("users_password not like", value, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordIn(List<String> values) {
            addCriterion("users_password in", values, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotIn(List<String> values) {
            addCriterion("users_password not in", values, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordBetween(String value1, String value2) {
            addCriterion("users_password between", value1, value2, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andUsersPasswordNotBetween(String value1, String value2) {
            addCriterion("users_password not between", value1, value2, "usersPassword");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
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