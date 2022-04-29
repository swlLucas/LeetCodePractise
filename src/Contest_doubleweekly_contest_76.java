public class Contest_weekly_contest_288 {
    class Solution {
        public int largestInteger(int num) {
            int res = 0;
            int size = String.valueOf(num).length();
            int[] temp = new int[size];
            for (int i = size - 1; i >= 0; i--) {
                temp[i] = num % 10;
                num /= 10;
            }
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (((temp[i] % 2) ^ (temp[j] % 2)) == 0 && temp[i] < temp[j]) {
                        int cur = temp[i];
                        temp[i] = temp[j];
                        temp[j] = cur;
                    }
                }
            }
            int idx = 1;
            for (int i = size - 1; i >= 0; i--) {
                res += temp[i] * idx;
                idx *= 10;
            }
            return res;
        }
    }
}
