package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class PatientsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientsExample() {
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

        public Criteria andPatientsNameIsNull() {
            addCriterion("patients_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientsNameIsNotNull() {
            addCriterion("patients_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientsNameEqualTo(String value) {
            addCriterion("patients_name =", value, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameNotEqualTo(String value) {
            addCriterion("patients_name <>", value, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameGreaterThan(String value) {
            addCriterion("patients_name >", value, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameGreaterThanOrEqualTo(String value) {
            addCriterion("patients_name >=", value, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameLessThan(String value) {
            addCriterion("patients_name <", value, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameLessThanOrEqualTo(String value) {
            addCriterion("patients_name <=", value, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameLike(String value) {
            addCriterion("patients_name like", value, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameNotLike(String value) {
            addCriterion("patients_name not like", value, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameIn(List<String> values) {
            addCriterion("patients_name in", values, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameNotIn(List<String> values) {
            addCriterion("patients_name not in", values, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameBetween(String value1, String value2) {
            addCriterion("patients_name between", value1, value2, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsNameNotBetween(String value1, String value2) {
            addCriterion("patients_name not between", value1, value2, "patientsName");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneIsNull() {
            addCriterion("patients_phone is null");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneIsNotNull() {
            addCriterion("patients_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneEqualTo(String value) {
            addCriterion("patients_phone =", value, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneNotEqualTo(String value) {
            addCriterion("patients_phone <>", value, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneGreaterThan(String value) {
            addCriterion("patients_phone >", value, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("patients_phone >=", value, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneLessThan(String value) {
            addCriterion("patients_phone <", value, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneLessThanOrEqualTo(String value) {
            addCriterion("patients_phone <=", value, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneLike(String value) {
            addCriterion("patients_phone like", value, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneNotLike(String value) {
            addCriterion("patients_phone not like", value, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneIn(List<String> values) {
            addCriterion("patients_phone in", values, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneNotIn(List<String> values) {
            addCriterion("patients_phone not in", values, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneBetween(String value1, String value2) {
            addCriterion("patients_phone between", value1, value2, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsPhoneNotBetween(String value1, String value2) {
            addCriterion("patients_phone not between", value1, value2, "patientsPhone");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardIsNull() {
            addCriterion("patients_idcard is null");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardIsNotNull() {
            addCriterion("patients_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardEqualTo(String value) {
            addCriterion("patients_idcard =", value, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardNotEqualTo(String value) {
            addCriterion("patients_idcard <>", value, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardGreaterThan(String value) {
            addCriterion("patients_idcard >", value, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("patients_idcard >=", value, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardLessThan(String value) {
            addCriterion("patients_idcard <", value, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardLessThanOrEqualTo(String value) {
            addCriterion("patients_idcard <=", value, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardLike(String value) {
            addCriterion("patients_idcard like", value, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardNotLike(String value) {
            addCriterion("patients_idcard not like", value, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardIn(List<String> values) {
            addCriterion("patients_idcard in", values, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardNotIn(List<String> values) {
            addCriterion("patients_idcard not in", values, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardBetween(String value1, String value2) {
            addCriterion("patients_idcard between", value1, value2, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsIdcardNotBetween(String value1, String value2) {
            addCriterion("patients_idcard not between", value1, value2, "patientsIdcard");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditIsNull() {
            addCriterion("patients_credit is null");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditIsNotNull() {
            addCriterion("patients_credit is not null");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditEqualTo(Integer value) {
            addCriterion("patients_credit =", value, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditNotEqualTo(Integer value) {
            addCriterion("patients_credit <>", value, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditGreaterThan(Integer value) {
            addCriterion("patients_credit >", value, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("patients_credit >=", value, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditLessThan(Integer value) {
            addCriterion("patients_credit <", value, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditLessThanOrEqualTo(Integer value) {
            addCriterion("patients_credit <=", value, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditIn(List<Integer> values) {
            addCriterion("patients_credit in", values, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditNotIn(List<Integer> values) {
            addCriterion("patients_credit not in", values, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditBetween(Integer value1, Integer value2) {
            addCriterion("patients_credit between", value1, value2, "patientsCredit");
            return (Criteria) this;
        }

        public Criteria andPatientsCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("patients_credit not between", value1, value2, "patientsCredit");
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