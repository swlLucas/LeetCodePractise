package LeetCodeOffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCodeOffer32Medium {
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

        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) {
                return new ArrayList<List<Integer>>();
            }
            List<List<Integer>> res = new ArrayList<>();
            LinkedList<Integer> temp;
            // true:从左到右打印
            // false:从右到左
            boolean flag = true;
            Deque<TreeNode> deque = new LinkedList<>();
            deque.offer(root);
            while (!deque.isEmpty()) {
                int size = deque.size();
                TreeNode treeNode;
                temp = new LinkedList<>();
                for (int i = 0; i < size; i++) {
                    treeNode = deque.poll();
                    if (flag) {
                        temp.addFirst(treeNode.val);
                        if (treeNode.left != null) deque.offer(treeNode.left);
                        if (treeNode.right != null) deque.offer(treeNode.right);
                    } else {
                        temp.addLast(treeNode.val);
                    }

                }
                flag = !flag;
                res.add(temp);
            }
            return res;
        }

        //    3
        //  9   20       取deque的队尾元素，将子节点按从右往左添加到队首
        // 5 3 15 7      取deque的队首元素，将子节点按从左往右添加到队尾
        public List<List<Integer>> levelOrder2(TreeNode root) {
            if (root == null) {
                return new ArrayList<List<Integer>>();
            }
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> temp;
            // true:从左到右打印
            // false:从右到左
            boolean flag = true;
            Deque<TreeNode> deque = new LinkedList<>();
            deque.offer(root);
            while (!deque.isEmpty()) {
                int size = deque.size();
                TreeNode treeNode;
                temp = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    if (flag) {
                        treeNode = deque.removeFirst();
                        temp.add(treeNode.val);
                        if (treeNode.left != null) deque.addLast(treeNode.left);
                        if (treeNode.right != null) deque.addLast(treeNode.right);
                    } else {
                        treeNode = deque.removeLast();
                        temp.add(treeNode.val);
                        if (treeNode.right != null) deque.addFirst(treeNode.right);
                        if (treeNode.left != null) deque.addFirst(treeNode.left);
                    }
                }
                flag = !flag;
                res.add(temp);
            }
            return res;
        }
    }
}
