package interview;

/**
 * interview23 输入一个链表，反转链表后，输出新链表的表头。
 */
public class interview23 {

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
        public ListNode ReverseList(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode pre = null;
            ListNode temp = null;
            while (head != null) {
                temp = head.next;
                head.next = pre;
                pre = head;
                head = temp;
            }
            return pre;
        }
    }
}