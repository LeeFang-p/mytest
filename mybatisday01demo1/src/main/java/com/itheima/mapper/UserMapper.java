package com.itheima.mapper;

import com.itheima.domain.Info;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import com.itheima.domain.UserInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface UserMapper {


    /**
     * 查询所有用户信息
     * @return
     */
    @Select({"select * from tab_route where cid=4"})
    @Results({
            @Result(column = "rid",property = "user.uid"),
            @Result(column = "rname",property = "user.username"),
            @Result(
                    column = "rid  ",property = "user",
                    one = @One(select="com.itheima.mapper.UserMapper.findByUserId",fetchType = FetchType.EAGER)
            )
    })
    List<UserInfo> findAll();

    @Select("select * from tab_route where rid=#{value}")
    @Results({
            @Result(column = "rname",property = "cname")
    })
    Info findByUserId(int uid);

    int saveUser(User user);

    /**
     * 根据用户Id修改信息
     * @param user
     * @return
     */
    @Update({"update tab_user set username = #{username} where uid = #{uid} "})

    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Delete("delete from tab_user where uid=#{id}")
    int delete(@Param("id") Integer id);


    /**
     * 查询条数
     * @return
     */
    @Select({"select count(*) from user"})
    int findCount();

    /**
     * 通过id查找用户
     * @param uid
     * @return
     */


    /**
     * 根据名字进行模糊查询
     * @param name
     * @return
     */
    @Select("select * from tab_user where username like '%${username}%'")
    List<User> findUserByUsername( @Param("username") String name);


    @Select("select * from tab_user where username like '%${user.username}'")
    QueryVo findByVo(int cid);



    int insert(User user);
}
