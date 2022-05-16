package com.jiyufei.platform.dao;

import com.jiyufei.platform.bean.OutVul;
import com.jiyufei.platform.bean.OutVulExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutVulMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    long countByExample(OutVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    int deleteByExample(OutVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    int insert(OutVul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    int insertSelective(OutVul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    List<OutVul> selectByExample(OutVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    OutVul selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OutVul record, @Param("example") OutVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OutVul record, @Param("example") OutVulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OutVul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_vul
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OutVul record);
}