package com.txcjh.fazhanceping.mapper;

import com.txcjh.fazhanceping.model.Dafen;
import com.txcjh.fazhanceping.model.DafenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DafenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int countByExample(DafenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int deleteByExample(DafenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int insert(Dafen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int insertSelective(Dafen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    List<Dafen> selectByExample(DafenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    Dafen selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int updateByExampleSelective(@Param("record") Dafen record, @Param("example") DafenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int updateByExample(@Param("record") Dafen record, @Param("example") DafenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int updateByPrimaryKeySelective(Dafen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dafen
     *
     * @mbggenerated Wed Feb 27 14:17:47 CST 2019
     */
    int updateByPrimaryKey(Dafen record);
}