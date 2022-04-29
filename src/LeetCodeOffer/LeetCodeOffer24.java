package LeetCodeOffer;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCodeOffer24 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
        }

        public ListNode reverseList(ListNode head) {
            //栈
//            Deque<ListNode> deque = new LinkedList<>();
//            while (head != null){
//                deque.push(head);
//                head = head.next;
//            }
//            ListNode res = deque.peek();
//            while (!deque.isEmpty()) {
//                ListNode first = deque.pop();
//                first.next = deque.peek();
//            }
//            return res;

            //迭代
            ListNode pre = null;
            ListNode next = null;
            ListNode cur = head;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return head;
        }
        
    }
}
