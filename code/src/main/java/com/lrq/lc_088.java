package com.lrq;
/*
    题目描述：将两个有序数组合并为一个新数组，且空间复杂度度为O(m+n)
    思路：等价于归并排序的merge过程，运用双指针的思想，开始两个指针分别指向两个子数组的首位置，
    依次比较谁小谁就放入临时数组，且其指针指向下一位置；当其中一个数组遍历完成，直接将另一数组添加至该数组后面即可。
 */
public class lc_088 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp=new int[m+n];
        int i=0;
        int j = 0, k = 0;  //两个数组的起始索引
        if (m == 0) {
            while (k < n) {
                tmp[i++] = nums2[k++];
            }
        }
        while (j < m && k < n) {
            if (nums1[j] < nums2[k]) {
                tmp[i++]=nums1[j++];
            } else {
                tmp[i++] = nums2[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j < m){
            tmp[i++] = nums1[j++];
        }

        while(k < n){
            tmp[i++] = nums2[k++];
        }
        for(int t=0;t<m+n;t++){
            nums1[t] = tmp[t];
        }
    }
}
