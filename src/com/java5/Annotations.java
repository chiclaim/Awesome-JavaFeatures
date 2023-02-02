package com.java5;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import static java.lang.annotation.ElementType.*;

/**
 * 注解
 *
 * 更多关于注解的内容可以查看我的：https://www.bilibili.com/video/BV1c3411w77q/
 *
 *
 * - SuppressWarnings
 * - Deprecated
 * - Override
 */
public class Annotations {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        deprecate();
        List l = new ArrayList<Number>();
        List<String> ls = l;       // unchecked warning
    }

    @Deprecated
    public static void deprecate(){
        System.out.println("deprecate method");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
    public @interface MyAnnotation {
    }

}


