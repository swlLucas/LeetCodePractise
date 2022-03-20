public class LeetCodeOffer28 {
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
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return cursion(root.left, root.right);
        }

        public boolean cursion(TreeNode node1, TreeNode node2) {
            if (node1 == null && node2 == null) return true;
            if (node1 == null || node2 == null || node1.val != node2.val) return false;
            //左子节点的左节点和右子节点的右节点是否对称
            //左子节点的右节点和右子节点的左节点是否对称
            return cursion(node1.left, node2.right) && cursion(node1.right, node2.left);
        }
    }
}
