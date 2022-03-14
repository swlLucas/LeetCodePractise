import java.util.TreeMap;

public class LeetCodeOffer53 {
    class Solution {
        //二分法
        public int search(int[] nums, int target) {
            int n = nums.length;
            if (n <= 0) {
                return 0;
            }
            int left = 0, right = n - 1;
            int mid, val = 0;
            while (left <= right) {
                mid = (right - left)/2 + left;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target){
                    right = mid - 1;
                } else {
                    val = mid;
                    break;
                }
            }
            if (nums[val] != target) {
                return 0;
            }
            int leftrange = val, rightrange = val;
            while (leftrange >= 0 && nums[leftrange] == target) {
                --leftrange;
            }
            while (rightrange < n && nums[rightrange] == target) {
                ++rightrange;
            }
            return rightrange - leftrange - 1;
        }




    }

}
