package com.java7;

/**
 * 可以将二进制字面量赋值给 byte/short/int/long
 */
public class BinaryLiterals {

    public static void main(String[] args) {
        // An 8-bit 'byte' value:
        byte aByte = (byte)0b00100001;

        // A 16-bit 'short' value:
        short aShort = (short)0b1010000101000101;

        // Some 32-bit 'int' values:
        int anInt1 = 0b10100001010001011010000101000101;
        int anInt2 = 0b101;
        int anInt3 = 0B101; // The B can be upper or lower case.

        // A 64-bit 'long' value. Note the "L" suffix:
        long aLong = 0b1010000101000101101000010100010110100001010001011010000101000101L;

        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInt1);
        System.out.println(anInt2);
        System.out.println(anInt3);
        System.out.println(aLong);
    }

}
