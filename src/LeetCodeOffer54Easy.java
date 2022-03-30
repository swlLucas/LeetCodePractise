public class LeetCodeOffer54Easy {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
        }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            //headA和headB的共有长度为c
            //headA独有长度为a，headB独有长度为b
            //有交集是a+c+b = b+c+a
            //没有交集是a+b = b+a
            ListNode h1 = headA, h2 = headB;
            //没有交集是h1和h2都为null，循环结束
            while (h1 != h2) {
                h1 = h1 == null ? headB : h1.next;
                h2 = h2 == null ? headA : h2.next;
            }
            return h2;
        }
    }
}
