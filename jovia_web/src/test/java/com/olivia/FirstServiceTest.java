package com.olivia;

import com.olivia.service.FirstService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JoviaApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class FirstServiceTest {

    @Resource
    FirstService service;

    @Test
    public void initTest1() {
        service.init1();
    }

    @Test
    public void initTest2() {
        service.init2();
    }

    @Test
    public void initTest3() {
        service.init3();
    }

    @Test
    public void initTest4() {
        service.init4();
    }

    @Test
    public void checkTest() {
        service.check("haha");
    }
}
