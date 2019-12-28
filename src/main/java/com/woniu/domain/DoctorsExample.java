package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class DoctorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorsExample() {
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

        public Criteria andDoctorsNameIsNull() {
            addCriterion("doctors_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameIsNotNull() {
            addCriterion("doctors_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameEqualTo(String value) {
            addCriterion("doctors_name =", value, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameNotEqualTo(String value) {
            addCriterion("doctors_name <>", value, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameGreaterThan(String value) {
            addCriterion("doctors_name >", value, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctors_name >=", value, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameLessThan(String value) {
            addCriterion("doctors_name <", value, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameLessThanOrEqualTo(String value) {
            addCriterion("doctors_name <=", value, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameLike(String value) {
            addCriterion("doctors_name like", value, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameNotLike(String value) {
            addCriterion("doctors_name not like", value, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameIn(List<String> values) {
            addCriterion("doctors_name in", values, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameNotIn(List<String> values) {
            addCriterion("doctors_name not in", values, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameBetween(String value1, String value2) {
            addCriterion("doctors_name between", value1, value2, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsNameNotBetween(String value1, String value2) {
            addCriterion("doctors_name not between", value1, value2, "doctorsName");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoIsNull() {
            addCriterion("doctors_photo is null");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoIsNotNull() {
            addCriterion("doctors_photo is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoEqualTo(String value) {
            addCriterion("doctors_photo =", value, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoNotEqualTo(String value) {
            addCriterion("doctors_photo <>", value, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoGreaterThan(String value) {
            addCriterion("doctors_photo >", value, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("doctors_photo >=", value, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoLessThan(String value) {
            addCriterion("doctors_photo <", value, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoLessThanOrEqualTo(String value) {
            addCriterion("doctors_photo <=", value, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoLike(String value) {
            addCriterion("doctors_photo like", value, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoNotLike(String value) {
            addCriterion("doctors_photo not like", value, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoIn(List<String> values) {
            addCriterion("doctors_photo in", values, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoNotIn(List<String> values) {
            addCriterion("doctors_photo not in", values, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoBetween(String value1, String value2) {
            addCriterion("doctors_photo between", value1, value2, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhotoNotBetween(String value1, String value2) {
            addCriterion("doctors_photo not between", value1, value2, "doctorsPhoto");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneIsNull() {
            addCriterion("doctors_phone is null");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneIsNotNull() {
            addCriterion("doctors_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneEqualTo(String value) {
            addCriterion("doctors_phone =", value, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneNotEqualTo(String value) {
            addCriterion("doctors_phone <>", value, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneGreaterThan(String value) {
            addCriterion("doctors_phone >", value, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("doctors_phone >=", value, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneLessThan(String value) {
            addCriterion("doctors_phone <", value, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneLessThanOrEqualTo(String value) {
            addCriterion("doctors_phone <=", value, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneLike(String value) {
            addCriterion("doctors_phone like", value, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneNotLike(String value) {
            addCriterion("doctors_phone not like", value, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneIn(List<String> values) {
            addCriterion("doctors_phone in", values, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneNotIn(List<String> values) {
            addCriterion("doctors_phone not in", values, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneBetween(String value1, String value2) {
            addCriterion("doctors_phone between", value1, value2, "doctorsPhone");
            return (Criteria) this;
        }

        public Criteria andDoctorsPhoneNotBetween(String value1, String value2) {
            addCriterion("doctors_phone not between", value1, value2, "doctorsPhone");
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