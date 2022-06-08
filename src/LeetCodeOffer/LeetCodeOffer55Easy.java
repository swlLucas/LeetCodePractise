package LeetCodeOffer;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCodeOffer55Easy {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode(int x) {
                val = x;
            }
        }
        public int maxDepth(TreeNode root) {
            //递归
//            if (root == null) return 0;
//            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
            if(root == null) return 0;
            int res = 0;
            //bfs
            Deque<TreeNode> deque = new LinkedList<>(), temp;
            deque.add(root);
            while (!deque.isEmpty()) {
                temp = new LinkedList<>();
                for (TreeNode t : deque) {
                    if (t.left != null) temp.add(t.left);
                    if (t.right != null) temp.add(t.right);
                }
                deque = temp;
                ++res;
            }
            return res;
        }


    }
}
