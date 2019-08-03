package com.itheima.mapper;

import com.itheima.domain.Info;
import com.itheima.domain.TabInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface TabMapper {
    @Select("select * from tab_category where cid=#{cid}")
    @Results({
            @Result(column = "cid",property = "cid"),
            @Result(column = "cid",property = "info.cid"),
            @Result(column = "cname",property = "info.cname")
    })
    TabInfo findTabInfoByCid(@Param("cid") int cid);


    @Select("select * from tab_category")
    @Results({
            @Result(column = "cid",property = "rid"),
            @Result(column = "rname",property = "cname"),
            @Result(column = "cid",property = "infos",many = @Many(select="com.itheima.mapper.UserMapper.findByUserId"))
    })
    List<TabInfo> findAll();
}
