package org.example.链表.分割链表;

import org.example.工具.ListNode;
import org.example.工具.ListUtil;

/**
 * @Author guanpeng.chong
 * @Date 2023/10/8 01:22
 */
public class Solution {

    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode dummy1 = list1;
        ListNode dummy2 = list2;
        while (head != null) {
            if (head.val < x) {
                list1.next = head;
                list1 = list1.next;
            } else {
                list2.next = head;
                list2 = list2.next;
            }
            ListNode tmp = head.next;
            head.next = null;
            head = tmp;
        }
        if (dummy2.next != null){
            list1.next = dummy2.next;
        }
        return dummy1.next;
    }

    public static void main(String[] args) {
        ListNode head = ListUtil.listNode(new int[]{1, 4, 3, 2, 5, 2});
        int x = 3;
        Solution solution01 = new Solution();
        ListNode partition = solution01.partition(head, x);
        System.out.println(ListUtil.listNodeString(partition));
    }

}
