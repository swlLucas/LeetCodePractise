package LeetCodeOffer;

public class LeetCodeOffer21Easy {
    class Solution {
        public int[] exchange(int[] nums) {
            int n = nums.length;
            //left指向奇数的下一个位置
            //right指针一直往后移动直到末尾
            int left = 0;
            for (int right = 0; right < n; right++) {
                if (nums[right] % 2 == 1) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    ++left;
                }
            }
            return nums;
        }
    }
}
