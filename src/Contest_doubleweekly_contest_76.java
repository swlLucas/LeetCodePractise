public class Contest_doubleweekly_contest_76 {
    class Solution {
        //LeetCode 6060
        public int findClosestNumber(int[] nums) {
            int res = nums[0], min = Math.abs(nums[0]);
            for (int i = 1; i < nums.length; i++) {
                if (Math.abs(nums[i]) <= min) {
                    if (Math.abs(nums[i]) == min) {
                        res = Math.max(res, nums[i]);
                    } else {
                        res = nums[i];
                    }
                    min = Math.abs(nums[i]);
                }
            }
            return res;
        }

        //LeetCode 6061
        public long waysToBuyPensPencils(int total, int cost1, int cost2) {
            //买或者不买
            //f(0) = 1 一支都不买
            //f(1) = f(0) + (能否买钢笔) + （能否买铅笔）
            long a = 1;

            while (total > 0) {
                a = total > cost1 ? a++ : a;
                a = total > cost2 ? a++ : a;
                total = total - (Math.min(cost1, cost2));
            }
            return a;
        }
    }
}
