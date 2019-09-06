import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
        List list =new ArrayList<Integer>();
        while (listNode!=null) {
            list.add(listNode.var);
            listNode=listNode.next;
        }
        return Collections.reverse(list);
    }
    }
}
