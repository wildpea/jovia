package com.olivia.threadtest;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@Slf4j
public class FirstDaemon4 implements Callable<ArrayList<Integer>> {

    @Override
    public ArrayList<Integer> call() throws Exception {
        int j = 20;
        ArrayList<Integer> al = new ArrayList<>(j);
        while (j-- > 0) {
            log.info("tid: {}, name: {}, j: {}", Thread.currentThread().getId(), Thread.currentThread().getName(), j);
            al.add(j);
            sleep(1);
        }

        return al;
    }
}
