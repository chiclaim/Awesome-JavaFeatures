package com.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * try-with-resources 语句能够声明一个或多个资源，且该资源对象实现了 AutoCloseable 接口，那么当 try 语句执行结束后，会自动关闭该资源对象
 *
 * - java.io.Closeable 继承接口 java.lang.AutoCloseable
 * - java.lang.AutoCloseable 1.7 新增
 */
public class TryWithResourcesStatement {

    /**
     * 1.7 之前关闭资源需要在 finally 关闭，存在大量的模板代码
     */
    static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }


    static String readFirstLineFromFile(String path) throws IOException {
        // try 执行完毕后，自动关闭 BufferedReader br 对象
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) {

    }

}
