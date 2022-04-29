package LeetCodeOffer;

public class LeetCodeOffer13Medium {
    class Solution {
        public int movingCount(int m, int n, int k) {
            boolean[][] flag = new boolean[m][n];
            return dfs(m, n, k, 0, 0, flag);
        }

        public int dfs(int m, int n, int k, int i, int j, boolean[][] flag) {
            if (i < 0 || i >= m || j < 0 || j >= n || flag[i][j]) return 0;
            if (i / 10 + i % 10 + j / 10 + j % 10 > k) return 0;
            flag[i][j] = true;
            return dfs(m, n, k, i, j - 1, flag ) +
                    dfs(m, n, k, i, j + 1, flag) +
                    dfs(m, n, k, i - 1, j, flag) +
                    dfs(m, n, k, i + 1, j, flag) + 1;
        }
    }
}
