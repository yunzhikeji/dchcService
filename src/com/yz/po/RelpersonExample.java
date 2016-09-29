package com.yz.po;

import java.util.ArrayList;
import java.util.List;

public class RelpersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelpersonExample() {
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

        public Criteria andRtypeIsNull() {
            addCriterion("rtype is null");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNotNull() {
            addCriterion("rtype is not null");
            return (Criteria) this;
        }

        public Criteria andRtypeEqualTo(Integer value) {
            addCriterion("rtype =", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotEqualTo(Integer value) {
            addCriterion("rtype <>", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThan(Integer value) {
            addCriterion("rtype >", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rtype >=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThan(Integer value) {
            addCriterion("rtype <", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThanOrEqualTo(Integer value) {
            addCriterion("rtype <=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeIn(List<Integer> values) {
            addCriterion("rtype in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotIn(List<Integer> values) {
            addCriterion("rtype not in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeBetween(Integer value1, Integer value2) {
            addCriterion("rtype between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rtype not between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIsNull() {
            addCriterion("registerAddress is null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIsNotNull() {
            addCriterion("registerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressEqualTo(String value) {
            addCriterion("registerAddress =", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotEqualTo(String value) {
            addCriterion("registerAddress <>", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressGreaterThan(String value) {
            addCriterion("registerAddress >", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressGreaterThanOrEqualTo(String value) {
            addCriterion("registerAddress >=", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLessThan(String value) {
            addCriterion("registerAddress <", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLessThanOrEqualTo(String value) {
            addCriterion("registerAddress <=", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLike(String value) {
            addCriterion("registerAddress like", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotLike(String value) {
            addCriterion("registerAddress not like", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIn(List<String> values) {
            addCriterion("registerAddress in", values, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotIn(List<String> values) {
            addCriterion("registerAddress not in", values, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressBetween(String value1, String value2) {
            addCriterion("registerAddress between", value1, value2, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotBetween(String value1, String value2) {
            addCriterion("registerAddress not between", value1, value2, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressIsNull() {
            addCriterion("currentAddress is null");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressIsNotNull() {
            addCriterion("currentAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressEqualTo(String value) {
            addCriterion("currentAddress =", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressNotEqualTo(String value) {
            addCriterion("currentAddress <>", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressGreaterThan(String value) {
            addCriterion("currentAddress >", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressGreaterThanOrEqualTo(String value) {
            addCriterion("currentAddress >=", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressLessThan(String value) {
            addCriterion("currentAddress <", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressLessThanOrEqualTo(String value) {
            addCriterion("currentAddress <=", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressLike(String value) {
            addCriterion("currentAddress like", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressNotLike(String value) {
            addCriterion("currentAddress not like", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressIn(List<String> values) {
            addCriterion("currentAddress in", values, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressNotIn(List<String> values) {
            addCriterion("currentAddress not in", values, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressBetween(String value1, String value2) {
            addCriterion("currentAddress between", value1, value2, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressNotBetween(String value1, String value2) {
            addCriterion("currentAddress not between", value1, value2, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitIsNull() {
            addCriterion("workdUnit is null");
            return (Criteria) this;
        }

        public Criteria andWorkdunitIsNotNull() {
            addCriterion("workdUnit is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdunitEqualTo(String value) {
            addCriterion("workdUnit =", value, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitNotEqualTo(String value) {
            addCriterion("workdUnit <>", value, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitGreaterThan(String value) {
            addCriterion("workdUnit >", value, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitGreaterThanOrEqualTo(String value) {
            addCriterion("workdUnit >=", value, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitLessThan(String value) {
            addCriterion("workdUnit <", value, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitLessThanOrEqualTo(String value) {
            addCriterion("workdUnit <=", value, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitLike(String value) {
            addCriterion("workdUnit like", value, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitNotLike(String value) {
            addCriterion("workdUnit not like", value, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitIn(List<String> values) {
            addCriterion("workdUnit in", values, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitNotIn(List<String> values) {
            addCriterion("workdUnit not in", values, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitBetween(String value1, String value2) {
            addCriterion("workdUnit between", value1, value2, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitNotBetween(String value1, String value2) {
            addCriterion("workdUnit not between", value1, value2, "workdunit");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressIsNull() {
            addCriterion("workdUnitAddress is null");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressIsNotNull() {
            addCriterion("workdUnitAddress is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressEqualTo(String value) {
            addCriterion("workdUnitAddress =", value, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressNotEqualTo(String value) {
            addCriterion("workdUnitAddress <>", value, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressGreaterThan(String value) {
            addCriterion("workdUnitAddress >", value, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressGreaterThanOrEqualTo(String value) {
            addCriterion("workdUnitAddress >=", value, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressLessThan(String value) {
            addCriterion("workdUnitAddress <", value, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressLessThanOrEqualTo(String value) {
            addCriterion("workdUnitAddress <=", value, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressLike(String value) {
            addCriterion("workdUnitAddress like", value, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressNotLike(String value) {
            addCriterion("workdUnitAddress not like", value, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressIn(List<String> values) {
            addCriterion("workdUnitAddress in", values, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressNotIn(List<String> values) {
            addCriterion("workdUnitAddress not in", values, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressBetween(String value1, String value2) {
            addCriterion("workdUnitAddress between", value1, value2, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andWorkdunitaddressNotBetween(String value1, String value2) {
            addCriterion("workdUnitAddress not between", value1, value2, "workdunitaddress");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andIspermitIsNull() {
            addCriterion("isPermit is null");
            return (Criteria) this;
        }

        public Criteria andIspermitIsNotNull() {
            addCriterion("isPermit is not null");
            return (Criteria) this;
        }

        public Criteria andIspermitEqualTo(Integer value) {
            addCriterion("isPermit =", value, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitNotEqualTo(Integer value) {
            addCriterion("isPermit <>", value, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitGreaterThan(Integer value) {
            addCriterion("isPermit >", value, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPermit >=", value, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitLessThan(Integer value) {
            addCriterion("isPermit <", value, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitLessThanOrEqualTo(Integer value) {
            addCriterion("isPermit <=", value, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitIn(List<Integer> values) {
            addCriterion("isPermit in", values, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitNotIn(List<Integer> values) {
            addCriterion("isPermit not in", values, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitBetween(Integer value1, Integer value2) {
            addCriterion("isPermit between", value1, value2, "ispermit");
            return (Criteria) this;
        }

        public Criteria andIspermitNotBetween(Integer value1, Integer value2) {
            addCriterion("isPermit not between", value1, value2, "ispermit");
            return (Criteria) this;
        }

        public Criteria andBelongplaceIsNull() {
            addCriterion("belongPlace is null");
            return (Criteria) this;
        }

        public Criteria andBelongplaceIsNotNull() {
            addCriterion("belongPlace is not null");
            return (Criteria) this;
        }

        public Criteria andBelongplaceEqualTo(String value) {
            addCriterion("belongPlace =", value, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceNotEqualTo(String value) {
            addCriterion("belongPlace <>", value, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceGreaterThan(String value) {
            addCriterion("belongPlace >", value, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceGreaterThanOrEqualTo(String value) {
            addCriterion("belongPlace >=", value, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceLessThan(String value) {
            addCriterion("belongPlace <", value, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceLessThanOrEqualTo(String value) {
            addCriterion("belongPlace <=", value, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceLike(String value) {
            addCriterion("belongPlace like", value, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceNotLike(String value) {
            addCriterion("belongPlace not like", value, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceIn(List<String> values) {
            addCriterion("belongPlace in", values, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceNotIn(List<String> values) {
            addCriterion("belongPlace not in", values, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceBetween(String value1, String value2) {
            addCriterion("belongPlace between", value1, value2, "belongplace");
            return (Criteria) this;
        }

        public Criteria andBelongplaceNotBetween(String value1, String value2) {
            addCriterion("belongPlace not between", value1, value2, "belongplace");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(String value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(String value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(String value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(String value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(String value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLike(String value) {
            addCriterion("uploadTime like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotLike(String value) {
            addCriterion("uploadTime not like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<String> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<String> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(String value1, String value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(String value1, String value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
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