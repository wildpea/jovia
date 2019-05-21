package com.olivia.threadtest;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@Slf4j
public class FirstDaemon2 implements Runnable {
    private static Integer i;
    private Thread t;
    private String name;

    public FirstDaemon2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (i == null) {
            i = 0;
        }
        int j = 10;
        while (j-- > 0) {
            log.info("tid: {}, name: {}, j: {}", Thread.currentThread().getId(), name, ++i);
        }
    }

    public void start() {
        log.info("daemon start! name: {}", name);
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }
}
