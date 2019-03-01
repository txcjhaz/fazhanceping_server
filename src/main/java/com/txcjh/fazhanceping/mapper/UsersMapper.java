package com.txcjh.fazhanceping.mapper;

import com.txcjh.fazhanceping.model.Users;
import com.txcjh.fazhanceping.model.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int countByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int deleteByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    Users selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Wed Feb 27 15:49:52 CST 2019
     */
    int updateByPrimaryKey(Users record);
}