package org.example.链表.合并双链表;

import org.example.工具.ListNode;
import org.example.工具.ListUtil;

/**
 * @Author guanpeng.chong
 * @Date 2023/10/8 00:58
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode p = new ListNode();
        dummy = p;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        while (list1 != null) {
            p.next = list1;
            list1 = list1.next;
            p = p.next;
        }

        while (list2 != null) {
            p.next = list2;
            list2 = list2.next;
            p = p.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = ListUtil.listNode(new int[]{1, 2, 4});
        ListNode list2 = ListUtil.listNode(new int[]{1, 3, 4});
        Solution solution = new Solution();
        ListNode listNode = solution.mergeTwoLists(list1, list2);
        System.out.println(ListUtil.listNodeString(listNode));
    }

}
