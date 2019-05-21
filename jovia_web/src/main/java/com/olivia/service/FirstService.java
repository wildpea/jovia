package com.olivia.service;

import com.olivia.aop.anno.LogAround;
import com.olivia.constants.ResCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.FutureTask;

import static java.lang.Thread.sleep;


/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@Service
@Slf4j
public class FirstService {

    public void init1() {
        FirstDaemon1 daemon = new FirstDaemon1();
        Thread a = new Thread(daemon, "haha");
        a.start();

        Thread b = new Thread(daemon, "gugu");
        b.start();
    }

    public void init2() {
        FirstDaemon2 a = new FirstDaemon2("haha");
        a.start();

        FirstDaemon2 b = new FirstDaemon2("gugu");
        b.start();
    }

    public void init3() {
        FirstDaemon3 a = new FirstDaemon3("haha");
        a.start();

        FirstDaemon3 b = new FirstDaemon3("gugu");
        b.start();
    }

    public void init4() {
        FirstDaemon4 a = new FirstDaemon4();
        FutureTask<ArrayList<Integer>> ft = new FutureTask<>(a);
        new Thread(ft, "haha").start();
        try {
            sleep(40);
            if (ft.isDone()) {
                ArrayList<Integer> al = ft.get();
                log.info("result: {}", al);
            }
        } catch (Exception e) {
            log.error("call Exception: {}, {}", e, e.getMessage());
            e.printStackTrace();
        }
    }

    @LogAround
    public ResCodeEnum check(String name) {
        if (name.equals("haha")) {
            return ResCodeEnum.SUCCESS;
        }

        return ResCodeEnum.ERR_INPUT_PARAM;
    }
}
