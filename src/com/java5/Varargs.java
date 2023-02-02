package com.java5;

/**
 * 可变参数
 */
public class Varargs {

    public static void print(String log,String log2){
        System.out.println(log);
        System.out.println(log2);
    }


    public static void prints(String...log){
        for (String s : log) {
            System.out.println(s);
        }
    }

    /*
    可变参数实际上是一个数组。我们应该避免可变参数的类型转换,例如第一个参数是String，第二个是从 Exception，这样是比较危险的，因为只有调用者知道自己传递了什么参数：
    Log.log(Object... objects) {
        String message = (String)objects[0];
        if (objects.length > 1) {
            Exception e = (Exception)objects[1];
            // Do something with the exception
        }
    }
    可以改成：
    Log.log(String message, Exception e, Object... objects) {
        // ...
    }
     */



    public static void main(String[] args) {
        prints("111","222");

    }

}
