import java.util.HashMap;

public class LeetCodeOffer35 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        //产生额外空间
//        public Node copyRandomList(Node head) {
//            if (head == null) {
//                return null;
//            }
//            HashMap<Node, Node> map = new HashMap<>();
//            Node cur = head;
//            Node copyNode;
//            while (cur != null) {
//                map.put(cur, new Node(cur.val));
//                cur = cur.next;
//            }
//            cur = head;
//            while (cur != null) {
//                if (cur.next != null) {
//                    map.get(cur).next = map.get(cur.next);
//                }
//                if (cur.random != null) {
//                    map.get(cur).random = map.get(cur.random);
//                }
//                cur = cur.next;
//            }
//            return map.get(head);
//        }

        //不产生额外数组，直接在原链表上复制
        //1->2->3->null
        //1->1->2->2->3->3->null
        public Node copyRandomList(Node head) {
            if (head == null) {
                return head;
            }
            Node cur = head;
            Node copycur = null;
            while (cur != null) {
                copycur = new Node(cur.val);
                copycur.next = cur.next;
                cur.next = copycur;
                cur = cur.next.next;
            }
            for(cur = head; cur != null; cur = cur.next.next) {
                if (cur.random != null) {
                    cur.next.random = cur.random.next;
                }
            }
            Node copyhead = head.next;
            for (Node node = head,temp = null; node != null && node.next != null; ){
                temp = node.next;
                node.next = temp.next;
                node = temp;
            }
            return copyhead;
        }
    }
}
