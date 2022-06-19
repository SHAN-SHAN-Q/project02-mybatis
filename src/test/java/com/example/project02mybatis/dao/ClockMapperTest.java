package com.example.project02mybatis.dao;

import com.example.project02mybatis.entity.Clock;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockMapperTest {

    @Autowired
    ClockMapper clockMapper;
    @Test
    void insertClock() {
        Clock clock = new Clock();
        clock.setId(2);
        clock.setSponsor(123);
        clock.setTime(new Date());
        clockMapper.insertClock(clock);

    }

    @Test
    void deleteClock() {
        clockMapper.deleteClock(1);
    }

    @Test
    void updateClock() {
        Clock clock = new Clock();
        clock.setId(2);
        clock.setSponsor(123);
        clock.setTime(new Date());
        clock.setStu_id(123);
        clock.setState(1);
        clockMapper.updateClock(clock);
    }

    @Test
    void selectClock() {
        Clock clock = clockMapper.selectClock(2);
        System.out.println(clock);
    }
}