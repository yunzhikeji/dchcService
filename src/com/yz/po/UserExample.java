package com.yz.po;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
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
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRegaddressIsNull() {
            addCriterion("regaddress is null");
            return (Criteria) this;
        }

        public Criteria andRegaddressIsNotNull() {
            addCriterion("regaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegaddressEqualTo(String value) {
            addCriterion("regaddress =", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotEqualTo(String value) {
            addCriterion("regaddress <>", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressGreaterThan(String value) {
            addCriterion("regaddress >", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressGreaterThanOrEqualTo(String value) {
            addCriterion("regaddress >=", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLessThan(String value) {
            addCriterion("regaddress <", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLessThanOrEqualTo(String value) {
            addCriterion("regaddress <=", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLike(String value) {
            addCriterion("regaddress like", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotLike(String value) {
            addCriterion("regaddress not like", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressIn(List<String> values) {
            addCriterion("regaddress in", values, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotIn(List<String> values) {
            addCriterion("regaddress not in", values, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressBetween(String value1, String value2) {
            addCriterion("regaddress between", value1, value2, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotBetween(String value1, String value2) {
            addCriterion("regaddress not between", value1, value2, "regaddress");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIsNull() {
            addCriterion("otherinfo is null");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIsNotNull() {
            addCriterion("otherinfo is not null");
            return (Criteria) this;
        }

        public Criteria andOtherinfoEqualTo(String value) {
            addCriterion("otherinfo =", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotEqualTo(String value) {
            addCriterion("otherinfo <>", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoGreaterThan(String value) {
            addCriterion("otherinfo >", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoGreaterThanOrEqualTo(String value) {
            addCriterion("otherinfo >=", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLessThan(String value) {
            addCriterion("otherinfo <", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLessThanOrEqualTo(String value) {
            addCriterion("otherinfo <=", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLike(String value) {
            addCriterion("otherinfo like", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotLike(String value) {
            addCriterion("otherinfo not like", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIn(List<String> values) {
            addCriterion("otherinfo in", values, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotIn(List<String> values) {
            addCriterion("otherinfo not in", values, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoBetween(String value1, String value2) {
            addCriterion("otherinfo between", value1, value2, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotBetween(String value1, String value2) {
            addCriterion("otherinfo not between", value1, value2, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andLiveaddressIsNull() {
            addCriterion("liveaddress is null");
            return (Criteria) this;
        }

        public Criteria andLiveaddressIsNotNull() {
            addCriterion("liveaddress is not null");
            return (Criteria) this;
        }

        public Criteria andLiveaddressEqualTo(String value) {
            addCriterion("liveaddress =", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressNotEqualTo(String value) {
            addCriterion("liveaddress <>", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressGreaterThan(String value) {
            addCriterion("liveaddress >", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("liveaddress >=", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressLessThan(String value) {
            addCriterion("liveaddress <", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressLessThanOrEqualTo(String value) {
            addCriterion("liveaddress <=", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressLike(String value) {
            addCriterion("liveaddress like", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressNotLike(String value) {
            addCriterion("liveaddress not like", value, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressIn(List<String> values) {
            addCriterion("liveaddress in", values, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressNotIn(List<String> values) {
            addCriterion("liveaddress not in", values, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressBetween(String value1, String value2) {
            addCriterion("liveaddress between", value1, value2, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andLiveaddressNotBetween(String value1, String value2) {
            addCriterion("liveaddress not between", value1, value2, "liveaddress");
            return (Criteria) this;
        }

        public Criteria andCreditcardIsNull() {
            addCriterion("creditcard is null");
            return (Criteria) this;
        }

        public Criteria andCreditcardIsNotNull() {
            addCriterion("creditcard is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcardEqualTo(String value) {
            addCriterion("creditcard =", value, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardNotEqualTo(String value) {
            addCriterion("creditcard <>", value, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardGreaterThan(String value) {
            addCriterion("creditcard >", value, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardGreaterThanOrEqualTo(String value) {
            addCriterion("creditcard >=", value, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardLessThan(String value) {
            addCriterion("creditcard <", value, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardLessThanOrEqualTo(String value) {
            addCriterion("creditcard <=", value, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardLike(String value) {
            addCriterion("creditcard like", value, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardNotLike(String value) {
            addCriterion("creditcard not like", value, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardIn(List<String> values) {
            addCriterion("creditcard in", values, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardNotIn(List<String> values) {
            addCriterion("creditcard not in", values, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardBetween(String value1, String value2) {
            addCriterion("creditcard between", value1, value2, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardNotBetween(String value1, String value2) {
            addCriterion("creditcard not between", value1, value2, "creditcard");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carid like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carid not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<String> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<String> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andAvantaIsNull() {
            addCriterion("avanta is null");
            return (Criteria) this;
        }

        public Criteria andAvantaIsNotNull() {
            addCriterion("avanta is not null");
            return (Criteria) this;
        }

        public Criteria andAvantaEqualTo(String value) {
            addCriterion("avanta =", value, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaNotEqualTo(String value) {
            addCriterion("avanta <>", value, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaGreaterThan(String value) {
            addCriterion("avanta >", value, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaGreaterThanOrEqualTo(String value) {
            addCriterion("avanta >=", value, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaLessThan(String value) {
            addCriterion("avanta <", value, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaLessThanOrEqualTo(String value) {
            addCriterion("avanta <=", value, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaLike(String value) {
            addCriterion("avanta like", value, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaNotLike(String value) {
            addCriterion("avanta not like", value, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaIn(List<String> values) {
            addCriterion("avanta in", values, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaNotIn(List<String> values) {
            addCriterion("avanta not in", values, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaBetween(String value1, String value2) {
            addCriterion("avanta between", value1, value2, "avanta");
            return (Criteria) this;
        }

        public Criteria andAvantaNotBetween(String value1, String value2) {
            addCriterion("avanta not between", value1, value2, "avanta");
            return (Criteria) this;
        }

        public Criteria andBodypicIsNull() {
            addCriterion("bodypic is null");
            return (Criteria) this;
        }

        public Criteria andBodypicIsNotNull() {
            addCriterion("bodypic is not null");
            return (Criteria) this;
        }

        public Criteria andBodypicEqualTo(String value) {
            addCriterion("bodypic =", value, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicNotEqualTo(String value) {
            addCriterion("bodypic <>", value, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicGreaterThan(String value) {
            addCriterion("bodypic >", value, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicGreaterThanOrEqualTo(String value) {
            addCriterion("bodypic >=", value, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicLessThan(String value) {
            addCriterion("bodypic <", value, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicLessThanOrEqualTo(String value) {
            addCriterion("bodypic <=", value, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicLike(String value) {
            addCriterion("bodypic like", value, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicNotLike(String value) {
            addCriterion("bodypic not like", value, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicIn(List<String> values) {
            addCriterion("bodypic in", values, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicNotIn(List<String> values) {
            addCriterion("bodypic not in", values, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicBetween(String value1, String value2) {
            addCriterion("bodypic between", value1, value2, "bodypic");
            return (Criteria) this;
        }

        public Criteria andBodypicNotBetween(String value1, String value2) {
            addCriterion("bodypic not between", value1, value2, "bodypic");
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