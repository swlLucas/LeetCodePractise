public class LeetCodeOffer03 {
    class Solution {
        public int findRepeatNumber(int[] nums) {
            int[] val = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                val[nums[i]]++;
                if (val[nums[i]] > 1) {
                    return nums[i];
                }
            }
            return 0;

        }
    }
}
