package com.apieceofcoding.lecture01;

public class VariableType {
    /**
     * 변수 (variable), 타입 (type)
     */
    public static void main(String[] args) {

        // byte (1byte = 8bit) 2^8 = 256
        byte aByte = 1;
        byte maxByte = 127; // 2^7 - 1
        byte minByte = -128; // -2^7
        // -128, ..., -1, 0, 1, ..., 127

        // short (2byte = 16bit) 2^16
        short aShort = 2;
        short maxShort = 32_767; // 2^15 - 1
        short minShort = -32_768; // -2^15

        // int (4byte = 32bit) 2^32 = 약 42억
        int anInt = 4;
        int maxInt = 2_147_483_647; // 2^31 - 1
//        Integer.MAX_VALUE;
//        Integer.MIN_VALUE;
        int minInt = -2_147_483_648; // -2^31

        // long (8byte = 64bit) 2^64
        long aLong = 8L;
        long maxLong = 9_223_372_036_854_775_807L; // 약 900경
        long minLong = -9_223_372_036_854_775_808L;

        // 실수형
        // float (4byte = 32bit)
        float aFloat = 4.0f;
        float maxFloat = 3.4028235e+38f;
        float minFloat = -3.4028235e+38f;

        // double (8byte = 64bit)
        double aDouble = 8.0d;
        double maxDouble = 1.7976931348623157e+308;
        double minDouble = -1.7976931348623157e+308;

        // char (2byte = 16bit) 2^16 = 65536
        char aChar = 'A';
        System.out.println(aChar);
        System.out.println((int) aChar);
        char minChar = 0;
        char maxChar = 65535;

        // boolean (1byte = 8bit)
        boolean aBoolean = true;
        boolean aFalse = false;
    }
}
