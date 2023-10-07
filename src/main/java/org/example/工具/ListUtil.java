package org.example.工具;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static ListNode listNode(int[] nums) {
        if (nums.length == 0){
            return new ListNode();
        }
        List<ListNode> list = new ArrayList<ListNode>();
        for (int num : nums) {
            list.add(new ListNode(num));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        return list.get(0);
    }

    public static String listNodeString(ListNode listNode){
        StringBuilder sb = new StringBuilder();
        while (listNode != null){
            sb.append(listNode.val)
                    .append("\t");
            listNode = listNode.next;
        }
        return sb.toString();
    }

}
