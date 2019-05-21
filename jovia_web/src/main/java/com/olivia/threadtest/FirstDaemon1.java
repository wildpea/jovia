package com.olivia.threadtest;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@Slf4j
public class FirstDaemon1 implements Runnable {

    private static Integer i;

    @Override
    public void run () {
        if (i == null) {
            i = 0;
        }
        int j = 10;
        while (j-- > 0) {
            log.info("tid: {}, name: {}, j: {}", Thread.currentThread().getId(), Thread.currentThread().getName(), ++i);
        }
    }
}
