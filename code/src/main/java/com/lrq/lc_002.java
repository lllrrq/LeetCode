package com.lrq;
import java.util.HashMap;

public class lc_002 {
    public void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] indexs=twoSum(nums,target);
        System.out.println(indexs[0]+','+indexs[1]);

    }

    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        // 建立k-v ，一一对应的哈希表
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            //[2,11，15，7]  target=9  hash内容是空的
            if (hash.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target - nums[i], i);
        }
        return indexs;
    }

}


