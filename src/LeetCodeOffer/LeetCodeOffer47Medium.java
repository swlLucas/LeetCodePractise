package LeetCodeOffer;

public class LeetCodeOffer47Medium {
    class Solution {
        public int maxValue(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            //第一行的每一列只能从前一列左边到达
            for (int j = 1; j < n; ++j) {
                grid[0][j] += grid[0][j-1];
            }
            //第一列的每一行都只能从前一行到达
            for (int i = 1; i < n; ++i) {
                grid[i][0] += grid[i-1][0];
            }
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    grid[i][j] += Math.max(grid[i-1][j], grid[i][j-1]);
                }
            }
            return grid[m-1][n-1];
        }
    }
}
