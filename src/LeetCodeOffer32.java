import java.util.Deque;
import java.util.LinkedList;

//git push commit
public class LeetCodeOffer32 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

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
        public int[] levelOrder(TreeNode root) {
            if (root == null) {
                return new int[]{};
            }
            int[] res = new int[1001];
            int count = 0;
            Deque<TreeNode> deque = new LinkedList<>();
            deque.offer(root);
            while (deque.size() > 0) {
                TreeNode temp = deque.poll();
                res[count++] = temp.val;
                if (temp.left != null) {
                    deque.offer(temp.left);
                }
                if (temp.right != null) {
                    deque.offer(temp.right);
                }
            }
            int[] result = new int[count];
            for (int i = 0; i < count; i++) {
                result[i] = res[i];
            }
            return result;
        }
    }
}
