package com.txcjh.fazhanceping.model;

import java.util.ArrayList;
import java.util.List;

public class TuiyouExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public TuiyouExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdIsNull() {
            addCriterion("recommended_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdIsNotNull() {
            addCriterion("recommended_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdEqualTo(Integer value) {
            addCriterion("recommended_user_id =", value, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdNotEqualTo(Integer value) {
            addCriterion("recommended_user_id <>", value, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdGreaterThan(Integer value) {
            addCriterion("recommended_user_id >", value, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommended_user_id >=", value, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdLessThan(Integer value) {
            addCriterion("recommended_user_id <", value, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("recommended_user_id <=", value, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdIn(List<Integer> values) {
            addCriterion("recommended_user_id in", values, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdNotIn(List<Integer> values) {
            addCriterion("recommended_user_id not in", values, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdBetween(Integer value1, Integer value2) {
            addCriterion("recommended_user_id between", value1, value2, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andRecommendedUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recommended_user_id not between", value1, value2, "recommendedUserId");
            return (Criteria) this;
        }

        public Criteria andIsexcelentIsNull() {
            addCriterion("isExcelent is null");
            return (Criteria) this;
        }

        public Criteria andIsexcelentIsNotNull() {
            addCriterion("isExcelent is not null");
            return (Criteria) this;
        }

        public Criteria andIsexcelentEqualTo(Boolean value) {
            addCriterion("isExcelent =", value, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentNotEqualTo(Boolean value) {
            addCriterion("isExcelent <>", value, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentGreaterThan(Boolean value) {
            addCriterion("isExcelent >", value, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isExcelent >=", value, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentLessThan(Boolean value) {
            addCriterion("isExcelent <", value, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentLessThanOrEqualTo(Boolean value) {
            addCriterion("isExcelent <=", value, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentIn(List<Boolean> values) {
            addCriterion("isExcelent in", values, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentNotIn(List<Boolean> values) {
            addCriterion("isExcelent not in", values, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentBetween(Boolean value1, Boolean value2) {
            addCriterion("isExcelent between", value1, value2, "isexcelent");
            return (Criteria) this;
        }

        public Criteria andIsexcelentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isExcelent not between", value1, value2, "isexcelent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuiyou
     *
     * @mbggenerated do_not_delete_during_merge Wed Feb 27 17:53:12 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tuiyou
     *
     * @mbggenerated Wed Feb 27 17:53:12 CST 2019
     */
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