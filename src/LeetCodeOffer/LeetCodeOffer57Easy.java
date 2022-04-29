package LeetCodeOffer;

public class LeetCodeOffer57Easy {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            String s = String.valueOf(target);

            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    return new int[]{nums[left], nums[right]};
                } else if (nums[left] + nums[right] < target) {
                    ++left;
                } else {
                    --right;
                }
            }
            return new int[0];
        }
    }
}
