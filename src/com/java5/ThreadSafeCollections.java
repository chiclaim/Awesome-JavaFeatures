package com.java5;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 线程安全的集合类
 * <p>
 * - ConcurrentHashMap
 * - CopyOnWriteArrayList
 * - CopyOnWriteArraySet
 */
public class ThreadSafeCollections {


    public static void main(String[] args) {

        new ConcurrentHashMap<>(); // HashMap 是非线程安全，线程安全的 Map 可以使用 ConcurrentHashMap
        new CopyOnWriteArrayList<>(); // ArrayList 是非线程安全，线程安全的 List 可以使用 ArrayList
        new CopyOnWriteArraySet<>();  //

    }

}
