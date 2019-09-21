package interview;

/**
 * Interview22 输入一个链表，输出该链表中倒数第k个结点。(头结点从1开始)
 */
public class Interview22 {

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        ListNode node1 = Solution.FindKthToTail(node, 1);
        while (node1 != null) {
            System.out.print(node1.val);
            node1 = node1.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static class Solution {
        public static ListNode FindKthToTail(ListNode head, int k) {
            if (head == null) {
                return null;
            }
            if (k <= 0) {
                return null;
            }
            boolean goal = false;
            ListNode top = head;
            ListNode run = head;
            while (top != null) {
                if (goal && run.next != null) {
                    run = run.next;
                }
                
                if (top.val == k) {
                    goal = true;
                }
                top = top.next;
            }
            if (!goal) {
                return null;
            }
            return run;
        }
    }
}