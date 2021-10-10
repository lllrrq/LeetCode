package com.lrq;

public class lc_053 {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=maxsum(arr);
        System.out.println(maxsum);
    }
    public static int maxsum(int[] arr){
        int[] dp=new int[arr.length];
        //初始化截止到当前位置i处的和
        dp[0]=arr[0];
        int maxsum=0;
        for(int i=1;i<arr.length;i++){
            //dp[i-1]+arr[i]表示的是加上第i个数的和
            if((dp[i-1]+arr[i])<arr[i]){
                dp[i]=arr[i];
            }else{
                dp[i]=dp[i-1]+arr[i];
            }
            if(dp[i]>maxsum){
                maxsum=dp[i];
            }
        }
        return maxsum;
    }
}
