package com.yz.po;

import java.util.ArrayList;
import java.util.List;

public class LocateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocateExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIslethouseIsNull() {
            addCriterion("isLetHouse is null");
            return (Criteria) this;
        }

        public Criteria andIslethouseIsNotNull() {
            addCriterion("isLetHouse is not null");
            return (Criteria) this;
        }

        public Criteria andIslethouseEqualTo(Integer value) {
            addCriterion("isLetHouse =", value, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseNotEqualTo(Integer value) {
            addCriterion("isLetHouse <>", value, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseGreaterThan(Integer value) {
            addCriterion("isLetHouse >", value, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("isLetHouse >=", value, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseLessThan(Integer value) {
            addCriterion("isLetHouse <", value, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseLessThanOrEqualTo(Integer value) {
            addCriterion("isLetHouse <=", value, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseIn(List<Integer> values) {
            addCriterion("isLetHouse in", values, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseNotIn(List<Integer> values) {
            addCriterion("isLetHouse not in", values, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseBetween(Integer value1, Integer value2) {
            addCriterion("isLetHouse between", value1, value2, "islethouse");
            return (Criteria) this;
        }

        public Criteria andIslethouseNotBetween(Integer value1, Integer value2) {
            addCriterion("isLetHouse not between", value1, value2, "islethouse");
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

        public Criteria andPolicenameIsNull() {
            addCriterion("policeName is null");
            return (Criteria) this;
        }

        public Criteria andPolicenameIsNotNull() {
            addCriterion("policeName is not null");
            return (Criteria) this;
        }

        public Criteria andPolicenameEqualTo(String value) {
            addCriterion("policeName =", value, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameNotEqualTo(String value) {
            addCriterion("policeName <>", value, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameGreaterThan(String value) {
            addCriterion("policeName >", value, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameGreaterThanOrEqualTo(String value) {
            addCriterion("policeName >=", value, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameLessThan(String value) {
            addCriterion("policeName <", value, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameLessThanOrEqualTo(String value) {
            addCriterion("policeName <=", value, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameLike(String value) {
            addCriterion("policeName like", value, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameNotLike(String value) {
            addCriterion("policeName not like", value, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameIn(List<String> values) {
            addCriterion("policeName in", values, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameNotIn(List<String> values) {
            addCriterion("policeName not in", values, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameBetween(String value1, String value2) {
            addCriterion("policeName between", value1, value2, "policename");
            return (Criteria) this;
        }

        public Criteria andPolicenameNotBetween(String value1, String value2) {
            addCriterion("policeName not between", value1, value2, "policename");
            return (Criteria) this;
        }

        public Criteria andRegisternameIsNull() {
            addCriterion("registerName is null");
            return (Criteria) this;
        }

        public Criteria andRegisternameIsNotNull() {
            addCriterion("registerName is not null");
            return (Criteria) this;
        }

        public Criteria andRegisternameEqualTo(String value) {
            addCriterion("registerName =", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotEqualTo(String value) {
            addCriterion("registerName <>", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameGreaterThan(String value) {
            addCriterion("registerName >", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameGreaterThanOrEqualTo(String value) {
            addCriterion("registerName >=", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLessThan(String value) {
            addCriterion("registerName <", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLessThanOrEqualTo(String value) {
            addCriterion("registerName <=", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLike(String value) {
            addCriterion("registerName like", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotLike(String value) {
            addCriterion("registerName not like", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameIn(List<String> values) {
            addCriterion("registerName in", values, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotIn(List<String> values) {
            addCriterion("registerName not in", values, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameBetween(String value1, String value2) {
            addCriterion("registerName between", value1, value2, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotBetween(String value1, String value2) {
            addCriterion("registerName not between", value1, value2, "registername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameIsNull() {
            addCriterion("realRegisterName is null");
            return (Criteria) this;
        }

        public Criteria andRealregisternameIsNotNull() {
            addCriterion("realRegisterName is not null");
            return (Criteria) this;
        }

        public Criteria andRealregisternameEqualTo(String value) {
            addCriterion("realRegisterName =", value, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameNotEqualTo(String value) {
            addCriterion("realRegisterName <>", value, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameGreaterThan(String value) {
            addCriterion("realRegisterName >", value, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameGreaterThanOrEqualTo(String value) {
            addCriterion("realRegisterName >=", value, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameLessThan(String value) {
            addCriterion("realRegisterName <", value, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameLessThanOrEqualTo(String value) {
            addCriterion("realRegisterName <=", value, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameLike(String value) {
            addCriterion("realRegisterName like", value, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameNotLike(String value) {
            addCriterion("realRegisterName not like", value, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameIn(List<String> values) {
            addCriterion("realRegisterName in", values, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameNotIn(List<String> values) {
            addCriterion("realRegisterName not in", values, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameBetween(String value1, String value2) {
            addCriterion("realRegisterName between", value1, value2, "realregistername");
            return (Criteria) this;
        }

        public Criteria andRealregisternameNotBetween(String value1, String value2) {
            addCriterion("realRegisterName not between", value1, value2, "realregistername");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("openTime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("openTime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(String value) {
            addCriterion("openTime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(String value) {
            addCriterion("openTime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(String value) {
            addCriterion("openTime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(String value) {
            addCriterion("openTime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(String value) {
            addCriterion("openTime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(String value) {
            addCriterion("openTime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLike(String value) {
            addCriterion("openTime like", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotLike(String value) {
            addCriterion("openTime not like", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<String> values) {
            addCriterion("openTime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<String> values) {
            addCriterion("openTime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(String value1, String value2) {
            addCriterion("openTime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(String value1, String value2) {
            addCriterion("openTime not between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andWifipwdIsNull() {
            addCriterion("wifiPwd is null");
            return (Criteria) this;
        }

        public Criteria andWifipwdIsNotNull() {
            addCriterion("wifiPwd is not null");
            return (Criteria) this;
        }

        public Criteria andWifipwdEqualTo(String value) {
            addCriterion("wifiPwd =", value, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdNotEqualTo(String value) {
            addCriterion("wifiPwd <>", value, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdGreaterThan(String value) {
            addCriterion("wifiPwd >", value, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdGreaterThanOrEqualTo(String value) {
            addCriterion("wifiPwd >=", value, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdLessThan(String value) {
            addCriterion("wifiPwd <", value, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdLessThanOrEqualTo(String value) {
            addCriterion("wifiPwd <=", value, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdLike(String value) {
            addCriterion("wifiPwd like", value, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdNotLike(String value) {
            addCriterion("wifiPwd not like", value, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdIn(List<String> values) {
            addCriterion("wifiPwd in", values, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdNotIn(List<String> values) {
            addCriterion("wifiPwd not in", values, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdBetween(String value1, String value2) {
            addCriterion("wifiPwd between", value1, value2, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andWifipwdNotBetween(String value1, String value2) {
            addCriterion("wifiPwd not between", value1, value2, "wifipwd");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonIsNull() {
            addCriterion("numberOfRelperson is null");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonIsNotNull() {
            addCriterion("numberOfRelperson is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonEqualTo(Integer value) {
            addCriterion("numberOfRelperson =", value, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonNotEqualTo(Integer value) {
            addCriterion("numberOfRelperson <>", value, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonGreaterThan(Integer value) {
            addCriterion("numberOfRelperson >", value, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfRelperson >=", value, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonLessThan(Integer value) {
            addCriterion("numberOfRelperson <", value, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfRelperson <=", value, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonIn(List<Integer> values) {
            addCriterion("numberOfRelperson in", values, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonNotIn(List<Integer> values) {
            addCriterion("numberOfRelperson not in", values, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonBetween(Integer value1, Integer value2) {
            addCriterion("numberOfRelperson between", value1, value2, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andNumberofrelpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfRelperson not between", value1, value2, "numberofrelperson");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberIsNull() {
            addCriterion("businessLicenseNumber is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberIsNotNull() {
            addCriterion("businessLicenseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberEqualTo(String value) {
            addCriterion("businessLicenseNumber =", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberNotEqualTo(String value) {
            addCriterion("businessLicenseNumber <>", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberGreaterThan(String value) {
            addCriterion("businessLicenseNumber >", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicenseNumber >=", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberLessThan(String value) {
            addCriterion("businessLicenseNumber <", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberLessThanOrEqualTo(String value) {
            addCriterion("businessLicenseNumber <=", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberLike(String value) {
            addCriterion("businessLicenseNumber like", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberNotLike(String value) {
            addCriterion("businessLicenseNumber not like", value, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberIn(List<String> values) {
            addCriterion("businessLicenseNumber in", values, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberNotIn(List<String> values) {
            addCriterion("businessLicenseNumber not in", values, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberBetween(String value1, String value2) {
            addCriterion("businessLicenseNumber between", value1, value2, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andBusinesslicensenumberNotBetween(String value1, String value2) {
            addCriterion("businessLicenseNumber not between", value1, value2, "businesslicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberIsNull() {
            addCriterion("hygieneLicenseNumber is null");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberIsNotNull() {
            addCriterion("hygieneLicenseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberEqualTo(String value) {
            addCriterion("hygieneLicenseNumber =", value, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberNotEqualTo(String value) {
            addCriterion("hygieneLicenseNumber <>", value, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberGreaterThan(String value) {
            addCriterion("hygieneLicenseNumber >", value, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberGreaterThanOrEqualTo(String value) {
            addCriterion("hygieneLicenseNumber >=", value, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberLessThan(String value) {
            addCriterion("hygieneLicenseNumber <", value, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberLessThanOrEqualTo(String value) {
            addCriterion("hygieneLicenseNumber <=", value, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberLike(String value) {
            addCriterion("hygieneLicenseNumber like", value, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberNotLike(String value) {
            addCriterion("hygieneLicenseNumber not like", value, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberIn(List<String> values) {
            addCriterion("hygieneLicenseNumber in", values, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberNotIn(List<String> values) {
            addCriterion("hygieneLicenseNumber not in", values, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberBetween(String value1, String value2) {
            addCriterion("hygieneLicenseNumber between", value1, value2, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andHygienelicensenumberNotBetween(String value1, String value2) {
            addCriterion("hygieneLicenseNumber not between", value1, value2, "hygienelicensenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberIsNull() {
            addCriterion("taxRegistrationCertificateNumber is null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberIsNotNull() {
            addCriterion("taxRegistrationCertificateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberEqualTo(String value) {
            addCriterion("taxRegistrationCertificateNumber =", value, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberNotEqualTo(String value) {
            addCriterion("taxRegistrationCertificateNumber <>", value, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberGreaterThan(String value) {
            addCriterion("taxRegistrationCertificateNumber >", value, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("taxRegistrationCertificateNumber >=", value, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberLessThan(String value) {
            addCriterion("taxRegistrationCertificateNumber <", value, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberLessThanOrEqualTo(String value) {
            addCriterion("taxRegistrationCertificateNumber <=", value, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberLike(String value) {
            addCriterion("taxRegistrationCertificateNumber like", value, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberNotLike(String value) {
            addCriterion("taxRegistrationCertificateNumber not like", value, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberIn(List<String> values) {
            addCriterion("taxRegistrationCertificateNumber in", values, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberNotIn(List<String> values) {
            addCriterion("taxRegistrationCertificateNumber not in", values, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberBetween(String value1, String value2) {
            addCriterion("taxRegistrationCertificateNumber between", value1, value2, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andTaxregistrationcertificatenumberNotBetween(String value1, String value2) {
            addCriterion("taxRegistrationCertificateNumber not between", value1, value2, "taxregistrationcertificatenumber");
            return (Criteria) this;
        }

        public Criteria andPlacetypeIsNull() {
            addCriterion("placeType is null");
            return (Criteria) this;
        }

        public Criteria andPlacetypeIsNotNull() {
            addCriterion("placeType is not null");
            return (Criteria) this;
        }

        public Criteria andPlacetypeEqualTo(Integer value) {
            addCriterion("placeType =", value, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeNotEqualTo(Integer value) {
            addCriterion("placeType <>", value, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeGreaterThan(Integer value) {
            addCriterion("placeType >", value, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("placeType >=", value, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeLessThan(Integer value) {
            addCriterion("placeType <", value, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeLessThanOrEqualTo(Integer value) {
            addCriterion("placeType <=", value, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeIn(List<Integer> values) {
            addCriterion("placeType in", values, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeNotIn(List<Integer> values) {
            addCriterion("placeType not in", values, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeBetween(Integer value1, Integer value2) {
            addCriterion("placeType between", value1, value2, "placetype");
            return (Criteria) this;
        }

        public Criteria andPlacetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("placeType not between", value1, value2, "placetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeIsNull() {
            addCriterion("entertainmentPlaceType is null");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeIsNotNull() {
            addCriterion("entertainmentPlaceType is not null");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeEqualTo(Integer value) {
            addCriterion("entertainmentPlaceType =", value, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeNotEqualTo(Integer value) {
            addCriterion("entertainmentPlaceType <>", value, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeGreaterThan(Integer value) {
            addCriterion("entertainmentPlaceType >", value, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("entertainmentPlaceType >=", value, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeLessThan(Integer value) {
            addCriterion("entertainmentPlaceType <", value, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeLessThanOrEqualTo(Integer value) {
            addCriterion("entertainmentPlaceType <=", value, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeIn(List<Integer> values) {
            addCriterion("entertainmentPlaceType in", values, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeNotIn(List<Integer> values) {
            addCriterion("entertainmentPlaceType not in", values, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeBetween(Integer value1, Integer value2) {
            addCriterion("entertainmentPlaceType between", value1, value2, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andEntertainmentplacetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("entertainmentPlaceType not between", value1, value2, "entertainmentplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeIsNull() {
            addCriterion("servicePlaceType is null");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeIsNotNull() {
            addCriterion("servicePlaceType is not null");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeEqualTo(Integer value) {
            addCriterion("servicePlaceType =", value, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeNotEqualTo(Integer value) {
            addCriterion("servicePlaceType <>", value, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeGreaterThan(Integer value) {
            addCriterion("servicePlaceType >", value, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicePlaceType >=", value, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeLessThan(Integer value) {
            addCriterion("servicePlaceType <", value, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeLessThanOrEqualTo(Integer value) {
            addCriterion("servicePlaceType <=", value, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeIn(List<Integer> values) {
            addCriterion("servicePlaceType in", values, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeNotIn(List<Integer> values) {
            addCriterion("servicePlaceType not in", values, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeBetween(Integer value1, Integer value2) {
            addCriterion("servicePlaceType between", value1, value2, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andServiceplacetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("servicePlaceType not between", value1, value2, "serviceplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeIsNull() {
            addCriterion("specialPlaceType is null");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeIsNotNull() {
            addCriterion("specialPlaceType is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeEqualTo(Integer value) {
            addCriterion("specialPlaceType =", value, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeNotEqualTo(Integer value) {
            addCriterion("specialPlaceType <>", value, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeGreaterThan(Integer value) {
            addCriterion("specialPlaceType >", value, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialPlaceType >=", value, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeLessThan(Integer value) {
            addCriterion("specialPlaceType <", value, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeLessThanOrEqualTo(Integer value) {
            addCriterion("specialPlaceType <=", value, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeIn(List<Integer> values) {
            addCriterion("specialPlaceType in", values, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeNotIn(List<Integer> values) {
            addCriterion("specialPlaceType not in", values, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeBetween(Integer value1, Integer value2) {
            addCriterion("specialPlaceType between", value1, value2, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andSpecialplacetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("specialPlaceType not between", value1, value2, "specialplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeIsNull() {
            addCriterion("nineSmallPlaceType is null");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeIsNotNull() {
            addCriterion("nineSmallPlaceType is not null");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeEqualTo(Integer value) {
            addCriterion("nineSmallPlaceType =", value, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeNotEqualTo(Integer value) {
            addCriterion("nineSmallPlaceType <>", value, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeGreaterThan(Integer value) {
            addCriterion("nineSmallPlaceType >", value, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nineSmallPlaceType >=", value, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeLessThan(Integer value) {
            addCriterion("nineSmallPlaceType <", value, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeLessThanOrEqualTo(Integer value) {
            addCriterion("nineSmallPlaceType <=", value, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeIn(List<Integer> values) {
            addCriterion("nineSmallPlaceType in", values, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeNotIn(List<Integer> values) {
            addCriterion("nineSmallPlaceType not in", values, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeBetween(Integer value1, Integer value2) {
            addCriterion("nineSmallPlaceType between", value1, value2, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andNinesmallplacetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("nineSmallPlaceType not between", value1, value2, "ninesmallplacetype");
            return (Criteria) this;
        }

        public Criteria andPlaceareaIsNull() {
            addCriterion("placeArea is null");
            return (Criteria) this;
        }

        public Criteria andPlaceareaIsNotNull() {
            addCriterion("placeArea is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceareaEqualTo(String value) {
            addCriterion("placeArea =", value, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaNotEqualTo(String value) {
            addCriterion("placeArea <>", value, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaGreaterThan(String value) {
            addCriterion("placeArea >", value, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaGreaterThanOrEqualTo(String value) {
            addCriterion("placeArea >=", value, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaLessThan(String value) {
            addCriterion("placeArea <", value, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaLessThanOrEqualTo(String value) {
            addCriterion("placeArea <=", value, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaLike(String value) {
            addCriterion("placeArea like", value, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaNotLike(String value) {
            addCriterion("placeArea not like", value, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaIn(List<String> values) {
            addCriterion("placeArea in", values, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaNotIn(List<String> values) {
            addCriterion("placeArea not in", values, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaBetween(String value1, String value2) {
            addCriterion("placeArea between", value1, value2, "placearea");
            return (Criteria) this;
        }

        public Criteria andPlaceareaNotBetween(String value1, String value2) {
            addCriterion("placeArea not between", value1, value2, "placearea");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorIsNull() {
            addCriterion("numberOfFloor is null");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorIsNotNull() {
            addCriterion("numberOfFloor is not null");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorEqualTo(Integer value) {
            addCriterion("numberOfFloor =", value, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorNotEqualTo(Integer value) {
            addCriterion("numberOfFloor <>", value, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorGreaterThan(Integer value) {
            addCriterion("numberOfFloor >", value, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfFloor >=", value, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorLessThan(Integer value) {
            addCriterion("numberOfFloor <", value, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfFloor <=", value, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorIn(List<Integer> values) {
            addCriterion("numberOfFloor in", values, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorNotIn(List<Integer> values) {
            addCriterion("numberOfFloor not in", values, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorBetween(Integer value1, Integer value2) {
            addCriterion("numberOfFloor between", value1, value2, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberoffloorNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfFloor not between", value1, value2, "numberoffloor");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportIsNull() {
            addCriterion("numberOfChannelport is null");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportIsNotNull() {
            addCriterion("numberOfChannelport is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportEqualTo(Integer value) {
            addCriterion("numberOfChannelport =", value, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportNotEqualTo(Integer value) {
            addCriterion("numberOfChannelport <>", value, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportGreaterThan(Integer value) {
            addCriterion("numberOfChannelport >", value, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfChannelport >=", value, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportLessThan(Integer value) {
            addCriterion("numberOfChannelport <", value, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfChannelport <=", value, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportIn(List<Integer> values) {
            addCriterion("numberOfChannelport in", values, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportNotIn(List<Integer> values) {
            addCriterion("numberOfChannelport not in", values, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportBetween(Integer value1, Integer value2) {
            addCriterion("numberOfChannelport between", value1, value2, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofchannelportNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfChannelport not between", value1, value2, "numberofchannelport");
            return (Criteria) this;
        }

        public Criteria andNumberofroomIsNull() {
            addCriterion("numberOfRoom is null");
            return (Criteria) this;
        }

        public Criteria andNumberofroomIsNotNull() {
            addCriterion("numberOfRoom is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofroomEqualTo(Integer value) {
            addCriterion("numberOfRoom =", value, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomNotEqualTo(Integer value) {
            addCriterion("numberOfRoom <>", value, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomGreaterThan(Integer value) {
            addCriterion("numberOfRoom >", value, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfRoom >=", value, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomLessThan(Integer value) {
            addCriterion("numberOfRoom <", value, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfRoom <=", value, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomIn(List<Integer> values) {
            addCriterion("numberOfRoom in", values, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomNotIn(List<Integer> values) {
            addCriterion("numberOfRoom not in", values, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomBetween(Integer value1, Integer value2) {
            addCriterion("numberOfRoom between", value1, value2, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofroomNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfRoom not between", value1, value2, "numberofroom");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonIsNull() {
            addCriterion("numberOfHoldperson is null");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonIsNotNull() {
            addCriterion("numberOfHoldperson is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonEqualTo(Integer value) {
            addCriterion("numberOfHoldperson =", value, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonNotEqualTo(Integer value) {
            addCriterion("numberOfHoldperson <>", value, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonGreaterThan(Integer value) {
            addCriterion("numberOfHoldperson >", value, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfHoldperson >=", value, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonLessThan(Integer value) {
            addCriterion("numberOfHoldperson <", value, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfHoldperson <=", value, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonIn(List<Integer> values) {
            addCriterion("numberOfHoldperson in", values, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonNotIn(List<Integer> values) {
            addCriterion("numberOfHoldperson not in", values, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonBetween(Integer value1, Integer value2) {
            addCriterion("numberOfHoldperson between", value1, value2, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andNumberofholdpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfHoldperson not between", value1, value2, "numberofholdperson");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationIsNull() {
            addCriterion("certificateOfQualification is null");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationIsNotNull() {
            addCriterion("certificateOfQualification is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationEqualTo(Integer value) {
            addCriterion("certificateOfQualification =", value, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationNotEqualTo(Integer value) {
            addCriterion("certificateOfQualification <>", value, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationGreaterThan(Integer value) {
            addCriterion("certificateOfQualification >", value, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("certificateOfQualification >=", value, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationLessThan(Integer value) {
            addCriterion("certificateOfQualification <", value, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationLessThanOrEqualTo(Integer value) {
            addCriterion("certificateOfQualification <=", value, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationIn(List<Integer> values) {
            addCriterion("certificateOfQualification in", values, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationNotIn(List<Integer> values) {
            addCriterion("certificateOfQualification not in", values, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationBetween(Integer value1, Integer value2) {
            addCriterion("certificateOfQualification between", value1, value2, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andCertificateofqualificationNotBetween(Integer value1, Integer value2) {
            addCriterion("certificateOfQualification not between", value1, value2, "certificateofqualification");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesIsNull() {
            addCriterion("fireFacilities is null");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesIsNotNull() {
            addCriterion("fireFacilities is not null");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesEqualTo(String value) {
            addCriterion("fireFacilities =", value, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesNotEqualTo(String value) {
            addCriterion("fireFacilities <>", value, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesGreaterThan(String value) {
            addCriterion("fireFacilities >", value, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("fireFacilities >=", value, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesLessThan(String value) {
            addCriterion("fireFacilities <", value, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesLessThanOrEqualTo(String value) {
            addCriterion("fireFacilities <=", value, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesLike(String value) {
            addCriterion("fireFacilities like", value, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesNotLike(String value) {
            addCriterion("fireFacilities not like", value, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesIn(List<String> values) {
            addCriterion("fireFacilities in", values, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesNotIn(List<String> values) {
            addCriterion("fireFacilities not in", values, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesBetween(String value1, String value2) {
            addCriterion("fireFacilities between", value1, value2, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andFirefacilitiesNotBetween(String value1, String value2) {
            addCriterion("fireFacilities not between", value1, value2, "firefacilities");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameIsNull() {
            addCriterion("chargePersonName is null");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameIsNotNull() {
            addCriterion("chargePersonName is not null");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameEqualTo(String value) {
            addCriterion("chargePersonName =", value, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameNotEqualTo(String value) {
            addCriterion("chargePersonName <>", value, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameGreaterThan(String value) {
            addCriterion("chargePersonName >", value, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("chargePersonName >=", value, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameLessThan(String value) {
            addCriterion("chargePersonName <", value, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameLessThanOrEqualTo(String value) {
            addCriterion("chargePersonName <=", value, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameLike(String value) {
            addCriterion("chargePersonName like", value, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameNotLike(String value) {
            addCriterion("chargePersonName not like", value, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameIn(List<String> values) {
            addCriterion("chargePersonName in", values, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameNotIn(List<String> values) {
            addCriterion("chargePersonName not in", values, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameBetween(String value1, String value2) {
            addCriterion("chargePersonName between", value1, value2, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonnameNotBetween(String value1, String value2) {
            addCriterion("chargePersonName not between", value1, value2, "chargepersonname");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneIsNull() {
            addCriterion("chargePersonPhone is null");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneIsNotNull() {
            addCriterion("chargePersonPhone is not null");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneEqualTo(String value) {
            addCriterion("chargePersonPhone =", value, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneNotEqualTo(String value) {
            addCriterion("chargePersonPhone <>", value, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneGreaterThan(String value) {
            addCriterion("chargePersonPhone >", value, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneGreaterThanOrEqualTo(String value) {
            addCriterion("chargePersonPhone >=", value, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneLessThan(String value) {
            addCriterion("chargePersonPhone <", value, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneLessThanOrEqualTo(String value) {
            addCriterion("chargePersonPhone <=", value, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneLike(String value) {
            addCriterion("chargePersonPhone like", value, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneNotLike(String value) {
            addCriterion("chargePersonPhone not like", value, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneIn(List<String> values) {
            addCriterion("chargePersonPhone in", values, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneNotIn(List<String> values) {
            addCriterion("chargePersonPhone not in", values, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneBetween(String value1, String value2) {
            addCriterion("chargePersonPhone between", value1, value2, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andChargepersonphoneNotBetween(String value1, String value2) {
            addCriterion("chargePersonPhone not between", value1, value2, "chargepersonphone");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonIsNull() {
            addCriterion("numberOfStaffPerson is null");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonIsNotNull() {
            addCriterion("numberOfStaffPerson is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonEqualTo(Integer value) {
            addCriterion("numberOfStaffPerson =", value, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonNotEqualTo(Integer value) {
            addCriterion("numberOfStaffPerson <>", value, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonGreaterThan(Integer value) {
            addCriterion("numberOfStaffPerson >", value, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfStaffPerson >=", value, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonLessThan(Integer value) {
            addCriterion("numberOfStaffPerson <", value, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfStaffPerson <=", value, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonIn(List<Integer> values) {
            addCriterion("numberOfStaffPerson in", values, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonNotIn(List<Integer> values) {
            addCriterion("numberOfStaffPerson not in", values, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonBetween(Integer value1, Integer value2) {
            addCriterion("numberOfStaffPerson between", value1, value2, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofstaffpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfStaffPerson not between", value1, value2, "numberofstaffperson");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorIsNull() {
            addCriterion("numberOfExternalMonitor is null");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorIsNotNull() {
            addCriterion("numberOfExternalMonitor is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorEqualTo(Integer value) {
            addCriterion("numberOfExternalMonitor =", value, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorNotEqualTo(Integer value) {
            addCriterion("numberOfExternalMonitor <>", value, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorGreaterThan(Integer value) {
            addCriterion("numberOfExternalMonitor >", value, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfExternalMonitor >=", value, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorLessThan(Integer value) {
            addCriterion("numberOfExternalMonitor <", value, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfExternalMonitor <=", value, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorIn(List<Integer> values) {
            addCriterion("numberOfExternalMonitor in", values, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorNotIn(List<Integer> values) {
            addCriterion("numberOfExternalMonitor not in", values, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorBetween(Integer value1, Integer value2) {
            addCriterion("numberOfExternalMonitor between", value1, value2, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofexternalmonitorNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfExternalMonitor not between", value1, value2, "numberofexternalmonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorIsNull() {
            addCriterion("numberOfInsideMonitor is null");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorIsNotNull() {
            addCriterion("numberOfInsideMonitor is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorEqualTo(Integer value) {
            addCriterion("numberOfInsideMonitor =", value, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorNotEqualTo(Integer value) {
            addCriterion("numberOfInsideMonitor <>", value, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorGreaterThan(Integer value) {
            addCriterion("numberOfInsideMonitor >", value, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberOfInsideMonitor >=", value, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorLessThan(Integer value) {
            addCriterion("numberOfInsideMonitor <", value, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorLessThanOrEqualTo(Integer value) {
            addCriterion("numberOfInsideMonitor <=", value, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorIn(List<Integer> values) {
            addCriterion("numberOfInsideMonitor in", values, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorNotIn(List<Integer> values) {
            addCriterion("numberOfInsideMonitor not in", values, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorBetween(Integer value1, Integer value2) {
            addCriterion("numberOfInsideMonitor between", value1, value2, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andNumberofinsidemonitorNotBetween(Integer value1, Integer value2) {
            addCriterion("numberOfInsideMonitor not between", value1, value2, "numberofinsidemonitor");
            return (Criteria) this;
        }

        public Criteria andProtectconditionIsNull() {
            addCriterion("protectCondition is null");
            return (Criteria) this;
        }

        public Criteria andProtectconditionIsNotNull() {
            addCriterion("protectCondition is not null");
            return (Criteria) this;
        }

        public Criteria andProtectconditionEqualTo(String value) {
            addCriterion("protectCondition =", value, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionNotEqualTo(String value) {
            addCriterion("protectCondition <>", value, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionGreaterThan(String value) {
            addCriterion("protectCondition >", value, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionGreaterThanOrEqualTo(String value) {
            addCriterion("protectCondition >=", value, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionLessThan(String value) {
            addCriterion("protectCondition <", value, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionLessThanOrEqualTo(String value) {
            addCriterion("protectCondition <=", value, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionLike(String value) {
            addCriterion("protectCondition like", value, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionNotLike(String value) {
            addCriterion("protectCondition not like", value, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionIn(List<String> values) {
            addCriterion("protectCondition in", values, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionNotIn(List<String> values) {
            addCriterion("protectCondition not in", values, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionBetween(String value1, String value2) {
            addCriterion("protectCondition between", value1, value2, "protectcondition");
            return (Criteria) this;
        }

        public Criteria andProtectconditionNotBetween(String value1, String value2) {
            addCriterion("protectCondition not between", value1, value2, "protectcondition");
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