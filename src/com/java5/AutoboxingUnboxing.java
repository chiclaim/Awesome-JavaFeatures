package com.java5;

/**
 * 自动装箱与拆箱
 */
public class AutoboxingUnboxing {


    public static void main(String[] args) {
        Integer a = 5; // 自动装箱，将 5 包装成 Integer（Integer.valueOf）
        int a1 = a; // 自动拆箱，将 Integer 转成 int（Integer.intValue）
        System.out.println(a);
        System.out.println(a1);

        // 其他的类型如 byte、float.... 的是同理
    }
}
