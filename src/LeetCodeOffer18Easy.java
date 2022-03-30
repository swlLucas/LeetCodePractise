public class LeetCodeOffer18Easy {
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
        public ListNode deleteNode(ListNode head, int val) {
            if (head == null) return null;
            ListNode before = new ListNode(0);
            ListNode temp = new ListNode(0);
            temp.next = before;
            before.next = head;
            while (head != null) {
                if (head.val == val) {
                    before.next = head.next;
                    break;
                }
                before = head;
                head = head.next;
            }
            return temp.next.next;
        }
    }
}
