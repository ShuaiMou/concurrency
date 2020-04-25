package com.unimelb.concurrency.aqs;

import com.unimelb.concurrency.annotations.Recommend;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.FutureTask;

@Slf4j
@Recommend
public class FutureTaskExample {

    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask = new FutureTask<String>(() -> {
            log.info("do something in callable");
            Thread.sleep(5000);
            return "Done";
        });

        new Thread(futureTask).start();
        log.info("do something in main");
        Thread.sleep(1000);
        String result = futureTask.get();
        log.info("result：{}", result);
    }
}
