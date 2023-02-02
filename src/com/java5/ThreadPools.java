package com.java5;

import java.util.concurrent.*;

/**
 * 线程池
 */
public class ThreadPools {

    public static void main(String[] args) {
        // 内置的线程池工具类：
        Executors.newFixedThreadPool(10);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newScheduledThreadPool(10);

        // 上面的线程池工具方法都是通过 ThreadPoolExecutor 来实现的。使用线程池的时候尽量自己根据需要来定制线程池参数，如：
        ExecutorService executor = new ThreadPoolExecutor(
                2,
                10,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(30), new ThreadPoolExecutor.DiscardOldestPolicy());

        executor.execute(new Runnable() {
            @Override
            public void run() {
                // do some stuff
            }
        });
    }
}
