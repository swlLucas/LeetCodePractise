public class LeetCodeOffer53Two {
    class Solution {
        public int missingNumber(int[] nums) {
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] != i) {
//                    return i;
//                }
//            }
//            return nums.length;
            //二分查找
            int left = 0, right = nums.length - 1;
            int mid;
            while (left <= right) {
                mid = left + (right - left)/2;
                if (nums[mid] == mid) {
                    left = mid + 1;
                } else if (nums[mid] > mid) {
                    right = mid - 1;
                }
            }
            return left;
        }
    }
}
