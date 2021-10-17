package com.lrq;
/*
    题目描述：最后一位加一，存放到一个新数组中
    思路：从高位开始遍历，主要是判断是否等于9，如果等于9那么将该位置零，如果不等于9就加一。
 */

public class lc_066 {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            //从最高位开始遍历
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}

