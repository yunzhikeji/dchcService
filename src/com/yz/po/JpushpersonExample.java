package com.yz.po;

import java.util.ArrayList;
import java.util.List;

public class JpushpersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JpushpersonExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNull() {
            addCriterion("picUrl is null");
            return (Criteria) this;
        }

        public Criteria andPicurlIsNotNull() {
            addCriterion("picUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPicurlEqualTo(String value) {
            addCriterion("picUrl =", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotEqualTo(String value) {
            addCriterion("picUrl <>", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThan(String value) {
            addCriterion("picUrl >", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("picUrl >=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThan(String value) {
            addCriterion("picUrl <", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLessThanOrEqualTo(String value) {
            addCriterion("picUrl <=", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlLike(String value) {
            addCriterion("picUrl like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotLike(String value) {
            addCriterion("picUrl not like", value, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlIn(List<String> values) {
            addCriterion("picUrl in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotIn(List<String> values) {
            addCriterion("picUrl not in", values, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlBetween(String value1, String value2) {
            addCriterion("picUrl between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andPicurlNotBetween(String value1, String value2) {
            addCriterion("picUrl not between", value1, value2, "picurl");
            return (Criteria) this;
        }

        public Criteria andIstrueIsNull() {
            addCriterion("isTrue is null");
            return (Criteria) this;
        }

        public Criteria andIstrueIsNotNull() {
            addCriterion("isTrue is not null");
            return (Criteria) this;
        }

        public Criteria andIstrueEqualTo(Integer value) {
            addCriterion("isTrue =", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueNotEqualTo(Integer value) {
            addCriterion("isTrue <>", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueGreaterThan(Integer value) {
            addCriterion("isTrue >", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueGreaterThanOrEqualTo(Integer value) {
            addCriterion("isTrue >=", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueLessThan(Integer value) {
            addCriterion("isTrue <", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueLessThanOrEqualTo(Integer value) {
            addCriterion("isTrue <=", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueIn(List<Integer> values) {
            addCriterion("isTrue in", values, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueNotIn(List<Integer> values) {
            addCriterion("isTrue not in", values, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueBetween(Integer value1, Integer value2) {
            addCriterion("isTrue between", value1, value2, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueNotBetween(Integer value1, Integer value2) {
            addCriterion("isTrue not between", value1, value2, "istrue");
            return (Criteria) this;
        }

        public Criteria andUserroleIdIsNull() {
            addCriterion("userrole_id is null");
            return (Criteria) this;
        }

        public Criteria andUserroleIdIsNotNull() {
            addCriterion("userrole_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEqualTo(Integer value) {
            addCriterion("userrole_id =", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdNotEqualTo(Integer value) {
            addCriterion("userrole_id <>", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdGreaterThan(Integer value) {
            addCriterion("userrole_id >", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userrole_id >=", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdLessThan(Integer value) {
            addCriterion("userrole_id <", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdLessThanOrEqualTo(Integer value) {
            addCriterion("userrole_id <=", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdIn(List<Integer> values) {
            addCriterion("userrole_id in", values, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdNotIn(List<Integer> values) {
            addCriterion("userrole_id not in", values, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdBetween(Integer value1, Integer value2) {
            addCriterion("userrole_id between", value1, value2, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userrole_id not between", value1, value2, "userroleId");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeIsNull() {
            addCriterion("checkStartTime is null");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeIsNotNull() {
            addCriterion("checkStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeEqualTo(String value) {
            addCriterion("checkStartTime =", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeNotEqualTo(String value) {
            addCriterion("checkStartTime <>", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeGreaterThan(String value) {
            addCriterion("checkStartTime >", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("checkStartTime >=", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeLessThan(String value) {
            addCriterion("checkStartTime <", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeLessThanOrEqualTo(String value) {
            addCriterion("checkStartTime <=", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeLike(String value) {
            addCriterion("checkStartTime like", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeNotLike(String value) {
            addCriterion("checkStartTime not like", value, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeIn(List<String> values) {
            addCriterion("checkStartTime in", values, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeNotIn(List<String> values) {
            addCriterion("checkStartTime not in", values, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeBetween(String value1, String value2) {
            addCriterion("checkStartTime between", value1, value2, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andCheckstarttimeNotBetween(String value1, String value2) {
            addCriterion("checkStartTime not between", value1, value2, "checkstarttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeIsNull() {
            addCriterion("backCheckResultTime is null");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeIsNotNull() {
            addCriterion("backCheckResultTime is not null");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeEqualTo(String value) {
            addCriterion("backCheckResultTime =", value, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeNotEqualTo(String value) {
            addCriterion("backCheckResultTime <>", value, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeGreaterThan(String value) {
            addCriterion("backCheckResultTime >", value, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeGreaterThanOrEqualTo(String value) {
            addCriterion("backCheckResultTime >=", value, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeLessThan(String value) {
            addCriterion("backCheckResultTime <", value, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeLessThanOrEqualTo(String value) {
            addCriterion("backCheckResultTime <=", value, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeLike(String value) {
            addCriterion("backCheckResultTime like", value, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeNotLike(String value) {
            addCriterion("backCheckResultTime not like", value, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeIn(List<String> values) {
            addCriterion("backCheckResultTime in", values, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeNotIn(List<String> values) {
            addCriterion("backCheckResultTime not in", values, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeBetween(String value1, String value2) {
            addCriterion("backCheckResultTime between", value1, value2, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andBackcheckresulttimeNotBetween(String value1, String value2) {
            addCriterion("backCheckResultTime not between", value1, value2, "backcheckresulttime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeIsNull() {
            addCriterion("isOutOfTime is null");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeIsNotNull() {
            addCriterion("isOutOfTime is not null");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeEqualTo(Integer value) {
            addCriterion("isOutOfTime =", value, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeNotEqualTo(Integer value) {
            addCriterion("isOutOfTime <>", value, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeGreaterThan(Integer value) {
            addCriterion("isOutOfTime >", value, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isOutOfTime >=", value, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeLessThan(Integer value) {
            addCriterion("isOutOfTime <", value, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeLessThanOrEqualTo(Integer value) {
            addCriterion("isOutOfTime <=", value, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeIn(List<Integer> values) {
            addCriterion("isOutOfTime in", values, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeNotIn(List<Integer> values) {
            addCriterion("isOutOfTime not in", values, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeBetween(Integer value1, Integer value2) {
            addCriterion("isOutOfTime between", value1, value2, "isoutoftime");
            return (Criteria) this;
        }

        public Criteria andIsoutoftimeNotBetween(Integer value1, Integer value2) {
            addCriterion("isOutOfTime not between", value1, value2, "isoutoftime");
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