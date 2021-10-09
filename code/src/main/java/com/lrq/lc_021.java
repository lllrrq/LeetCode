package com.lrq;

/*
    题目描述：将两个有序的链表合并为一个有序的链表
    思路：定义一个ListNode类，实现归并排序中最后一步两两合并过程
 */
public class lc_021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 类似归并排序中的合并过程
        ListNode dummyHead = new ListNode(0); //生成的新的链表
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {   //从比较两个链表中第一个节点的大小开始
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空(本来就是空链表或者原本的节点全部移到新链表中)，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return dummyHead.next;
    }
}
