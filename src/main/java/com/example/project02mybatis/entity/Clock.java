package com.example.project02mybatis.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @ClassName Clock
 * @Author 山山大魔王
 * @Date 2022/6/19 23:32
 * @Version 1.0
 */
@Data
public class Clock {
    private Integer id;

    private Integer stu_id;
    private Date time;
    private Integer sponsor;
    private Integer state;
}
