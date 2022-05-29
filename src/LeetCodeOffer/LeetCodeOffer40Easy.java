package LeetCodeOffer;

public class LeetCodeOffer40Easy {

    class Solution {
        //冒泡排序 从后往前找k个最小数
//        public int[] getLeastNumbers(int[] arr, int k) {
//            int size = arr.length;
//            if (size == 1) return arr;
//            int[] res = new int[k];
//            for (int i = 1; i <= k; i++) {
//                for (int j = size - 1; j >= i; j--) {
//                    if (arr[j] < arr[j - 1]) {
//                        swap(arr,j - 1, j);
//                    }
//                }
//                res[i - 1] = arr[i - 1];
//            }
//            return res;
//        }
        //快速排序
        public int[] getLeastNumbers(int[] arr, int k) {
            if (k >= arr.length) return arr;
            int i = 0, j = arr.length - 1;
            int[] res = new int[k];
            quickSort(arr, 0, j, k);
            for (int l = 0; l < k ; l++) {
                res[l] = arr[l];
            }
            return res;
        }

        public void quickSort(int[] arr, int i, int j, int k) {
            int left = i, right = j, temp = arr[i];
            while (left < right) {
                while (arr[right] >= temp && left < right) --right;
                while (arr[left] <= temp && left < right) ++left;
                swap(arr, left, right);
            }
            swap(arr, left, i);
            if (left < k) quickSort(arr, left + 1, j, k);
            if (left > k) quickSort(arr, i, left - 1, k);
            return;
        }

        public void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
