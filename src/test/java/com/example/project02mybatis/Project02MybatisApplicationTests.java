package com.example.project02mybatis;

import com.example.project02mybatis.dao.ClockMapper;
import com.example.project02mybatis.entity.Clock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Project02MybatisApplicationTests {
    @Autowired
    ClockMapper clockMapper;
    @Test
    void contextLoads() {

    }

}
