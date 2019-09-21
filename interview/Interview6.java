package interview;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Interview6 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Interview6 {

    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList list = new ArrayList<Integer>();
            while (listNode != null) {
                list.add(listNode.val);
                listNode = listNode.next;
            }
            Collections.reverse(list);
            return list;
        }
    }
}
