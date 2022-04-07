

public class LeetCodeOffer12Medium {
    class Solution {
        public boolean exist(char[][] board, String word) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (dfs(board, i, j, 0, word)) return true;
                }
            }
            return false;
        }

        boolean dfs(char[][] board, int i, int j, int k, String word) {
            int m = board.length, n = board[0].length;
            if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(k)) return false;
            if (k == word.length() - 1) return true;
            board[i][j] = '\0';
            boolean res = dfs(board, i - 1, j, k + 1, word) || dfs(board, i + 1, j, k + 1, word)
                         || dfs(board, i, j - 1, k + 1, word) || dfs(board, i, j + 1, k + 1, word);
            board[i][j] = word.charAt(k);
            return res;
        }
    }
}
