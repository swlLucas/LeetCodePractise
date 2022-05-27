package LeetCodeOffer;

public class LeetCodeOffer40Easy {
    //冒泡排序 从后往前找k个最小数
    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            int size = arr.length;
            if (size == 1) return arr;
            int[] res = new int[k];
            for (int i = 1; i <= k; i++) {
                for (int j = size - 1; j >= i; j--) {
                    if (arr[j] < arr[j - 1]) {
                        swap(arr,j - 1, j);
                    }
                }
                res[i - 1] = arr[i - 1];
            }
            return res;
        }

        public void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
