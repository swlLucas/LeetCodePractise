package LeetCodeOffer;

public class LeetCodeOffer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //以二维数组右上角为基础，属于二叉搜索树
        int n = matrix.length, m = matrix[0].length;
        if (n == 0 && m == 0) {
            return false;
        }
        int row = 0, col = m - 1;
        while (row < n && col >= 0) {
            if (matrix[row][col] < target) {
                ++row;
            } else if (matrix[row][col] > target){
                --col;
            } else if (matrix[row][col] == target){
                return true;
            }
        }
        return false;
    }
}
