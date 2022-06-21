package LeetCodeOffer;

public class LeetCodeOffer55Easy2 {
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

        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//            return !(recur(root) == -1);
        }

//        public int recur(TreeNode root) {
//            if (root == null) return 0;
//            int left = recur(root.left);
//            if (left == -1) return -1;
//            int right = recur(root.right);
//            if (right == -1) return -1;
//            return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
//        }

        public int depth(TreeNode root) {
            if (root == null) return 0;
            return Math.max(depth(root.left), depth(root.right)) + 1;
        }
    }
}
