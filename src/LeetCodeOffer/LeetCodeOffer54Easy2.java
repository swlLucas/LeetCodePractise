package LeetCodeOffer;

public class LeetCodeOffer54Easy2 {
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
        int count = 0, ans;
        public int kthLargest(TreeNode root, int k) {
            cursion(root, k);
            return ans;
        }
        //右中左遍历，结果由大到小
        public void cursion(TreeNode root, int k) {
            if (root.right != null) cursion(root.right, k);
            if (++count == k) {
                ans = root.val;
                return;
            }
            if (root.left != null) cursion(root.left, k);
        }
    }
}
