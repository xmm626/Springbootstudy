package com.springboot.mybatis.mapper;


import com.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "account", column = "account"),
            @Result(property = "password", column = "password"),
            @Result(property = "credits", column = "credits")
    })
    @Select("SELECT * FROM t_user ")
    List<User> selectAll();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "account", column = "account"),
            @Result(property = "password", column = "password"),
            @Result(property = "credits", column = "credits")
    })
    @Select("SELECT * FROM t_user WHERE id = #{id} ")
    User getOne(Long id);

    @Delete("DELETE FROM t_user WHERE id =#{id} ")
    void delete(Long id);

    @Insert("INSERT INTO t_user(id,account,password,credits)" +
            " VALUES(#{id}, #{account},#{password},#{credits}) ")
    void insert(User user);

    @Update("UPDATE t_user SET account=#{account},password=#{password},credits=#{credits} WHERE id =#{id}")
    void update(User user);
}
