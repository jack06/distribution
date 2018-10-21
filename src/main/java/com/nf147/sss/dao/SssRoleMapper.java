package com.nf147.sss.dao;

import com.nf147.sss.entity.SssRole;
import java.util.List;

public interface SssRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_role
     *
     * @mbg.generated
     */
    int insert(SssRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_role
     *
     * @mbg.generated
     */
    SssRole selectByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_role
     *
     * @mbg.generated
     */
    List<SssRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SssRole record);
}