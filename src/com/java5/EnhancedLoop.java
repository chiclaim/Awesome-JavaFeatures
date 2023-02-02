package com.java5;

/**
 * for 循环增强
 */
public class EnhancedLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // for 循环增强
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
