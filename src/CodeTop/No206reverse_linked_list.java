package CodeTop;

public class No206reverse_linked_list {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        //使用额外空间
//        public ListNode reverseList(ListNode head) {
//            if (head == null) return null;
//            Deque<ListNode> deque = new LinkedList<>();
//            while (head != null) {
//                deque.push(head);
//                head = head.next;
//            }
//            ListNode temp = new ListNode();
//            temp.next = deque.peek();
//            while (deque.size() > 0) {
//                ListNode cur = deque.pop();
//                cur.next = deque.peek();
//            }
//            return temp.next;
//        }

        //双指针
        //迭代
//        public ListNode reverseList(ListNode head) {
//            if (head == null) return null;
//            ListNode pre = null, cur = head, temp;
//            while (cur != null) {
//                temp = cur.next;
//                cur.next = pre;
//                cur = temp;
//                pre = cur;
//            }
//            return pre;
//        }

        //递归
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode cur = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return cur;
        }
    }
}
