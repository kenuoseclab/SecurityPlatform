package com.jiyufei.platform.dao;

import com.jiyufei.platform.bean.InVul;
import com.jiyufei.platform.bean.InVulExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InVulMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    long countByExample(InVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    int deleteByExample(InVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    int insert(InVul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    int insertSelective(InVul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    List<InVul> selectByExample(InVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    InVul selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") InVul record, @Param("example") InVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") InVul record, @Param("example") InVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(InVul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table in_vul
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(InVul record);
}