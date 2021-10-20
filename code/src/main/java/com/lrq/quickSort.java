package com.lrq;

public class quickSort {
    public static void main(String[] args) {
        int[] a={2,3,5,2,9,12};
        int[] b=quick_sort1(a,0,5);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }

    public static int AdjustArray(int s[], int l, int r) //返回调整后基准数的位置
    {
        int i = l, j = r;
        int x = s[l]; //s[l]即s[i]就是第一个坑
        while (i < j)  //直到i等于j时退出循环
        {
            // 从右向左找小于x的数来填s[i]
            while(i < j && s[j] >= x) //如果s[j]大于或等于x，则说明没找到，继续向左寻找，知道找到比x小的数跳出循环
                j--;
            if(i < j)
            {
                s[i] = s[j]; //找到之后，将s[j]填到s[i]中，s[j]就形成了一个新的坑
                i++;
            }

            // 从左向右找大于或等于x的数来填s[j]
            while(i < j && s[i] < x)
                i++;
            if(i < j)
            {
                s[j] = s[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑
                j--;
            }
        }
        //退出时，i等于j。将x填到这个坑中(中间那个值)。
        s[i] = x;
        return i;
    }

    public static int[] quick_sort1(int[] s,int l,int r) {
        if (l < r)
        {
            int i = AdjustArray(s, l, r);//先用挖坑填数法调整s[]
            quick_sort1(s, l, i - 1); // 递归调用
            quick_sort1(s, i + 1, r);
        }
        return s;
    }
}

