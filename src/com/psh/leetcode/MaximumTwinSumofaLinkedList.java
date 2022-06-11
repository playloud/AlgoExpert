package com.psh.leetcode;
import java.util.*;
public class MaximumTwinSumofaLinkedList {
    public int pairSum(ListNode head) {
        var arr = new ArrayList<ListNode>();

        ListNode cur = null;
        cur = head;
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size()/2; i++) {
            int a = arr.get(i).val;
            int b = arr.get(arr.size()-1-i).val;
            max = Math.max(max, (a+b));
        }
        return max;
    }
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
