package com.nf147.sss.dao;

import com.nf147.sss.entity.SssAssociation1;
import java.util.List;

public interface SssAssociation1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_association_1
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String ordOrderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_association_1
     *
     * @mbg.generated
     */
    int insert(SssAssociation1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_association_1
     *
     * @mbg.generated
     */
    SssAssociation1 selectByPrimaryKey(String ordOrderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_association_1
     *
     * @mbg.generated
     */
    List<SssAssociation1> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_association_1
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SssAssociation1 record);
}