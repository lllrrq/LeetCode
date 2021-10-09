package com.lrq;
/*
    题目描述：给定一个有序的数组，在“原地”删除重复的元素
    思路：用双指针，开始这两个指针同时指向数组中的第一个元素，如果相同快指针就指向下一元素，满指针不动；
    如果不同，满指针指向下一个，并且将快指针指向的元素放在满指针指向的位置，然后快指针也指向下一个，直到快指针>=数组的长度结束循环。
 */

public class lc_026 {
    public int removeDuplicates(int[] nums) {
        // 使用双指针
        if(nums==null){
            return nums.length;
        }
        int i = 0,j =0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}
