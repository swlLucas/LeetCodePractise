public class LeetCodeOffer22Easy {
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
        public ListNode getKthFromEnd(ListNode head, int k) {
            //快慢指针
            //slow = head, fast = head ->>>>(向后k位)
            ListNode slow = head;
            ListNode fast = head;
            for (int i = 0; i < k; i++) {
                fast = head.next;
                head = head.next;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
