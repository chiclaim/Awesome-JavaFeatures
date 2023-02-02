package com.java7;

import java.util.*;

/**
 * 改进了将不可具体化的形式参数与 Varargs 方法一起使用时的编译器警告和错误
 */
public class NonReifiableParameters {

    /*
        1. 参数化类型如 ArrayList<String> 等是一个非具体化类型（non-reifiable types）
        2. 非具体化类型在运行时是不可用的类型
        3. 在编译期非具体化类型被类型擦除，如 ArrayList<String> 变成 ArrayList。这是为了和拥有泛型之前的老版本二进制代码兼容
     */

    /**
     * 堆污染
     */
    private static void heapPollution() {
        // 堆污染（Heap Pollution）：当参数化类型的变量引用不属于该参数化类型的对象时，就会发生堆污染
        List l = new ArrayList<Number>();

        // 什么是向后兼容？
        // Java4-->Java5-->Java6-->Java7    兼容老版本，就是所谓的向后兼容（向下兼容）

        // 为什么编译器允许赋值？
        // 向后兼容。为了不支持泛型的Java版本。例如在Java5 中使用 Java4 封装的库，Java4封装的库返回一个集合（没有泛型），赋值给有泛型参数的变量。
        // 如果编译器不允许赋值的话，那 Java5 之前编写的库都需要重新编写升级。
        // 这可能也是泛型类型需要擦除的原因，编译之后就没有所谓的泛型了。
        List<String> ls = l; // 堆污染，unchecked warning

        l.add(0, 42); // 堆污染， another unchecked warning

        String s = ls.get(0);      // ClassCastException is thrown
    }


    /**
     * 可变参数和非具体化参数一起使用时的潜在漏洞
     *
     * List<String>... varargs (使用了可变参数，同时也是用了非具体化类型，编译器会提示警告：Possible heap pollution from parameterized vararg type)
     *
     * 可以使用如下注解压制警告：
     * - @SuppressWarnings({"unchecked", "varargs"}) 可以压制方法声明的地方，无法压制方法调用的地方
     * - @SafeVarargs
     */
    @SafeVarargs
    public static void faultyMethod(List<String>... varargs) {
        // varargs = List<String>[]
        Object[] objectArray = varargs;  // Valid
        objectArray[0] = Arrays.asList(42, 43);
        String s = varargs[0].get(0);    // ClassCastException thrown here
    }

    @SuppressWarnings({"unchecked", "varargs"})
    public static <T> void addToList2 (List<T> listArg, T... elements) {
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        faultyMethod(list,list);
    }


}
