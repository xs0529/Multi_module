package com.xie.springbootdao.dao;

import com.xie.springbootdao.model.UserT;
import com.xie.springbootdao.model.UserTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    long countByExample(UserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int deleteByExample(UserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int insert(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int insertSelective(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    List<UserT> selectByExample(UserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    UserT selectByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserT record, @Param("example") UserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserT record, @Param("example") UserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserT record);
}