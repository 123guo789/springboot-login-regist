package com.weblogin.mapper;

import com.weblogin.bean.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface Usermapper {
    @Select(value = "select u.username,u.password from user u where u.username=#{username}")
    @Results({@Result(property = "username",column = "username"),
            @Result(property = "password",column = "password")})
    User findUserByName(@Param("username") String username);

    @Insert("insert into user values(#{id},#{username},#{password})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void regist(User user);

    @Select("select u.id from user u where u.username = #{username} and password = #{password}")
    Long login(User user);
}
