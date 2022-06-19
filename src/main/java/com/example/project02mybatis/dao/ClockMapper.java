package com.example.project02mybatis.dao;

import com.example.project02mybatis.entity.Clock;
import org.apache.ibatis.annotations.*;

/**
 * @Description
 * @ClassName Clock
 * @Author 山山大魔王
 * @Date 2022/6/19 23:37
 * @Version 1.0
 */
@Mapper
public interface ClockMapper {
    @Insert("insert into clock(id,stu_id,`time`,sponsor,`state`) values(#{id},#{stu_id},#{time},#{sponsor},#{state})")
    public int insertClock(Clock clock);
    @Delete("delete from clock where id=#{id}")
    public int deleteClock(Integer id);
    @Update("update `clock` set stu_id=#{stu_id},`time`=#{time},sponsor=#{sponsor},`state`=#{state}")
    public int updateClock(Clock clock);
    @Select("select * from clock where id=#{id}")
    public Clock selectClock(Integer id);
}
