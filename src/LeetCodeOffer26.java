public class LeetCodeOffer26 {
<<<<<<< HEAD
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
            if (A == null || B == null) return false;
            return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }

        public boolean dfs(TreeNode A, TreeNode B) {
            if (B == null) return true;
            if (A == null) return false;
            return A.val == B.val && dfs(A.left, B.left) && dfs(A.right, B.right);
        }
    }
=======
>>>>>>> 2bbf4591c427f21adfd2e58116fe74d0aea52f17
}
