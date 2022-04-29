package LeetCodeOffer;

public class LeetCodeOffer27 {
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
        public TreeNode mirrorTree(TreeNode root) {
            dfs(root);
            return root;
        }

        //交换当前节点的左右节点
        public void dfs(TreeNode treeNode) {
            if (treeNode == null) return;
            TreeNode temp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = temp;
            dfs(treeNode.left);
            dfs(treeNode.right);
        }
    }
}
