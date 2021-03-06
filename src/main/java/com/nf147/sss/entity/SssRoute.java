package com.nf147.sss.entity;

import java.math.BigDecimal;

public class SssRoute {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.route_ID
     *
     * @mbg.generated
     */
    private String routeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.city_ID
     *
     * @mbg.generated
     */
    private String cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.province_ID
     *
     * @mbg.generated
     */
    private String provinceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.route_Name
     *
     * @mbg.generated
     */
    private String routeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.start_Province
     *
     * @mbg.generated
     */
    private String startProvince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.start_City
     *
     * @mbg.generated
     */
    private String startCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.end_Province
     *
     * @mbg.generated
     */
    private String endProvince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.end_City
     *
     * @mbg.generated
     */
    private String endCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.mid_Province
     *
     * @mbg.generated
     */
    private String midProvince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.mid_City
     *
     * @mbg.generated
     */
    private String midCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.transport_Price
     *
     * @mbg.generated
     */
    private BigDecimal transportPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sss_route.comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.route_ID
     *
     * @return the value of sss_route.route_ID
     *
     * @mbg.generated
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.route_ID
     *
     * @param routeId the value for sss_route.route_ID
     *
     * @mbg.generated
     */
    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.city_ID
     *
     * @return the value of sss_route.city_ID
     *
     * @mbg.generated
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.city_ID
     *
     * @param cityId the value for sss_route.city_ID
     *
     * @mbg.generated
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.province_ID
     *
     * @return the value of sss_route.province_ID
     *
     * @mbg.generated
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.province_ID
     *
     * @param provinceId the value for sss_route.province_ID
     *
     * @mbg.generated
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.route_Name
     *
     * @return the value of sss_route.route_Name
     *
     * @mbg.generated
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.route_Name
     *
     * @param routeName the value for sss_route.route_Name
     *
     * @mbg.generated
     */
    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.start_Province
     *
     * @return the value of sss_route.start_Province
     *
     * @mbg.generated
     */
    public String getStartProvince() {
        return startProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.start_Province
     *
     * @param startProvince the value for sss_route.start_Province
     *
     * @mbg.generated
     */
    public void setStartProvince(String startProvince) {
        this.startProvince = startProvince == null ? null : startProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.start_City
     *
     * @return the value of sss_route.start_City
     *
     * @mbg.generated
     */
    public String getStartCity() {
        return startCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.start_City
     *
     * @param startCity the value for sss_route.start_City
     *
     * @mbg.generated
     */
    public void setStartCity(String startCity) {
        this.startCity = startCity == null ? null : startCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.end_Province
     *
     * @return the value of sss_route.end_Province
     *
     * @mbg.generated
     */
    public String getEndProvince() {
        return endProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.end_Province
     *
     * @param endProvince the value for sss_route.end_Province
     *
     * @mbg.generated
     */
    public void setEndProvince(String endProvince) {
        this.endProvince = endProvince == null ? null : endProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.end_City
     *
     * @return the value of sss_route.end_City
     *
     * @mbg.generated
     */
    public String getEndCity() {
        return endCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.end_City
     *
     * @param endCity the value for sss_route.end_City
     *
     * @mbg.generated
     */
    public void setEndCity(String endCity) {
        this.endCity = endCity == null ? null : endCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.mid_Province
     *
     * @return the value of sss_route.mid_Province
     *
     * @mbg.generated
     */
    public String getMidProvince() {
        return midProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.mid_Province
     *
     * @param midProvince the value for sss_route.mid_Province
     *
     * @mbg.generated
     */
    public void setMidProvince(String midProvince) {
        this.midProvince = midProvince == null ? null : midProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.mid_City
     *
     * @return the value of sss_route.mid_City
     *
     * @mbg.generated
     */
    public String getMidCity() {
        return midCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.mid_City
     *
     * @param midCity the value for sss_route.mid_City
     *
     * @mbg.generated
     */
    public void setMidCity(String midCity) {
        this.midCity = midCity == null ? null : midCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.transport_Price
     *
     * @return the value of sss_route.transport_Price
     *
     * @mbg.generated
     */
    public BigDecimal getTransportPrice() {
        return transportPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.transport_Price
     *
     * @param transportPrice the value for sss_route.transport_Price
     *
     * @mbg.generated
     */
    public void setTransportPrice(BigDecimal transportPrice) {
        this.transportPrice = transportPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sss_route.comment
     *
     * @return the value of sss_route.comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sss_route.comment
     *
     * @param comment the value for sss_route.comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}