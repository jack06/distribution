package com.nf147.sss.dao;

import com.nf147.sss.entity.SssCustomer;
import java.util.List;

public interface SssCustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_customer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String cuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_customer
     *
     * @mbg.generated
     */
    int insert(SssCustomer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_customer
     *
     * @mbg.generated
     */
    SssCustomer selectByPrimaryKey(String cuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_customer
     *
     * @mbg.generated
     */
    List<SssCustomer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SssCustomer record);
}