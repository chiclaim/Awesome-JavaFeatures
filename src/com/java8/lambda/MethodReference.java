package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Lambda方法引用语法：<br/>
 * 1，对象::对象方法，Lambda参数作为方法参数<br/>
 * 2，类::类方法，Lambda参数作为方法参数<br/>
 * 3，类::对象方法， Lambda第一个参数作为执行方法的对象<br/>
 * 
 * @author yuzhiqiang
 *
 */
public class MethodReference {

	List<String> list = Arrays.asList("black", "white", "grey", "pink", "red", "yellow");

	public static void main(String[] args) {
		MethodReference methodReference = new MethodReference();
		// methodReference.test1();
		// methodReference.test2();
		methodReference.test3();

	}

	/**
	 * 类::对象方法<br/>
	 * list.sort(String::compareToIgnoreCase); <br/>
	 * 等同于： list.sort((p1, p2) ->p1.compareToIgnoreCase(p2));
	 */
	public void test1() {
		list.sort(String::compareToIgnoreCase);
		LambdaSimple.printList(list);
	}

	/**
	 * 对象::对象方法<br/>
	 * setOnClickListener(System.out::println);<br/>
	 * 等同于：setOnClickListener((p1) -> System.out.println(p1));
	 */
	public void test2() {
		setOnClickListener(System.out::println);
	}

	/**
	 * 类::类方法<br/>
	 * setResultInterface(Math::addExact)<br/>
	 * 等同于：setResultInterface((int i1, int i2) -> Math.addExact(i1, i2));
	 */
	public void test3() {
		// setResultInterface((int i1, int i2) -> Math.addExact(i1, i2));
		setResultInterface(Math::addExact);
	}

	public void setResultInterface(ResultInterface ri) {
		System.out.println(ri.result(1, 2));
	}

	public void setOnClickListener(OnClickListener listener) {
		listener.onClick(this.toString());
	}

	@FunctionalInterface
	public interface ResultInterface {
		int result(int i1, int i2);
	}

	@FunctionalInterface
	public interface OnClickListener {
		void onClick(String string);
	}

}
