package com.rom.leetcode.leetcode;



public class 反转链表 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }
    public static ListNode reverseList(ListNode head) {
        ListNode tmp = head;
        if(tmp == null) return null;
        while(tmp.next != null) {
            ListNode nxt = tmp.next;
            tmp.next = nxt.next;
            nxt.next = head;
            head = nxt;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode tmp = reverseList(head);
        while(tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
}
