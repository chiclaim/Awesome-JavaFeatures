package com.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 1，Lambda表达式基本语法: (参数)->{} <br/>
 * 2，函数式接口：只包含一个抽象方法。一般会使用@FunctionalInterface注解。 <br/>
 * 任何一个Lambda表达式都可等价转换成函数式接口
 * 
 * @author yuzhiqiang
 *
 */
public class LambdaSimple {

	static String[] arrays = { "Jack", "Chiclaim", "Jobs", "Marks", "Abuse" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaSimple lambdaSimple = new LambdaSimple();
		// lambdaSimple.sortByNonLambda();
		lambdaSimple.sortByLambda();
	}

	/**
	 * 1，下面的lambda表达式里的p1,p2分别代表着Comparator接口方法 compare(String o1, String o2)
	 * 的参数。 <br/>
	 * 2，如果lambda的参数类型是可以被推导的那么参数的类型可以不写。如：sortByLambda2()
	 */
	void sortByLambda() {
		Arrays.sort(arrays, (String p1, String p2) -> Integer.compare(p1.length(), p2.length()));
		printArray(arrays);
	}

	void sortByLambda2() {
		Arrays.sort(arrays, (p1, p2) -> Integer.compare(p1.length(), p2.length()));
		printArray(arrays);
	}

	void sortByNonLambda() {
		Arrays.sort(arrays, new StringComparator());
		printArray(arrays);
	}

	void printArray(String[] arr) {
		for (String string : arr) {
			System.out.println(string);
		}
	}

	public static void printList(List<String> arr) {
		for (String string : arr) {
			System.out.println(string);
		}
	}

	/**
	 * 按长度排序
	 * 
	 * @author yuzhiqiang
	 *
	 */
	class StringComparator implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return Integer.compare(o1.length(), o2.length());
		}
	}

}
