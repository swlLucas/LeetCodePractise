package LeetCodeOffer;

public class LeetCodeOffer45Medium {
    class Solution {
        public String minNumber(int[] nums) {
            int i = 0, j = nums.length - 1;
            String[] temp = new String[nums.length];
            for (int k = 0; k <= j; k++) {
                temp[k] = String.valueOf(nums[k]);
            }
            QuickSort(temp, i, j);
            StringBuilder sb = new StringBuilder();
            for(String s : temp) {
                sb.append(s);
            }
            return sb.toString();
        }

        public void QuickSort(String[] temp, int start, int end) {
            if (start >= end) return;
            int i = start, j = end;
            String mid = temp[i];
            while (i < j) {
                while ((temp[j] + temp[i]).compareTo(temp[i] + temp[j]) >= 0 && i < j) --j;
                while ((temp[i] + temp[j]).compareTo(temp[j] + temp[i]) <= 0 && i < j) ++i;
                mid = temp[i];
                temp[i] = temp[j];
                temp[j] = mid;
            }
            temp[i] = mid;
            QuickSort(temp, start, i - 1);
            QuickSort(temp, i + 1, end);
        }
    }
}
