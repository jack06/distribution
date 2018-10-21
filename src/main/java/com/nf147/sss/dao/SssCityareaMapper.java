package com.nf147.sss.dao;

import com.nf147.sss.entity.SssCityarea;
import java.util.List;

public interface SssCityareaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_cityarea
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_cityarea
     *
     * @mbg.generated
     */
    int insert(SssCityarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_cityarea
     *
     * @mbg.generated
     */
    SssCityarea selectByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_cityarea
     *
     * @mbg.generated
     */
    List<SssCityarea> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sss_cityarea
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SssCityarea record);
}