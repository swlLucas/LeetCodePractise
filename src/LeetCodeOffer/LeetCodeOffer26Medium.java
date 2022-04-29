package LeetCodeOffer;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCodeOffer26Medium {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }

        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if (B == null || A == null) return false;
            boolean res = false;
            Deque<TreeNode> deque = new LinkedList<>();
            deque.offer(A);
            while (!deque.isEmpty()) {
                TreeNode temp = deque.poll();
                if (temp.val == B.val) {
                    if (cursion(temp, B)) {
                        res = true;
                        break;
                    }
                }
                if (temp.left != null) deque.offer(temp.left);
                if (temp.right != null) deque.offer(temp.right);
            }
            return res;
        }
        
        public boolean cursion(TreeNode A, TreeNode B) {
            if (A == null && B == null) {
                return true;
            } else if ( (A == null && B != null) || (A != null && B == null)) {
                return false;
            } else if (A.val != B.val) {
                return false;
            }
            if (!cursion(A.left, B.left)) {
                return false;
            }
            if (!cursion(A.right, B.right)) {
                return false;
            }
            return true;
        }
    }
}
