import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCodeOffer32easy {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) {
                return new ArrayList<List<Integer>>();
            }
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> temp;
            Deque<TreeNode> deque = new LinkedList<>();
            deque.offer(root);
            while (!deque.isEmpty()) {
                int capacity = deque.size();
                temp = new ArrayList<>();
                while (capacity > 0) {
                    TreeNode treeNode = deque.poll();
                    temp.add(treeNode.val);
                    if (treeNode.left != null) deque.offer(treeNode.left);
                    if (treeNode.right != null) deque.offer(treeNode.right);
                    --capacity;
                }
                res.add(temp);
            }
            return res;
        }
    }
}
