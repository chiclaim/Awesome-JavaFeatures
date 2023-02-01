package com.java7;

/**
 * catch 多个异常类型
 */
public class CatchingMultipleExceptionTypes {

    static class FirstException extends Exception { }
    static class SecondException extends Exception { }

    static void throwFirst() throws FirstException{

    }

    static void throwSecond() throws SecondException{

    }


    static void test1() {
        try {
            throwFirst();
            throwSecond();
        } catch (FirstException ex) {
            //logger.log(ex);
            ex.printStackTrace();
            // 可重新赋值
            ex = new FirstException();
            //throw ex;
        } catch (SecondException ex) {
            //logger.log(ex);
            ex.printStackTrace();
            //throw ex;
        }
    }

    static void test2() {
        try {
            throwFirst();
            throwSecond();
        } catch (FirstException | SecondException ex) {
            //logger.log(ex);
            ex.printStackTrace();
            // ex 不可重新赋值
            //throw ex;
        }
    }


}
