package LeetCodeOffer;

public class LeetCodeOffer43Easy {
    //num[i-1]作为前i-1个数的最大值
    //如果num[i-1]小于0，不加在num[i]上
    //如果大于0，与num[i]相加
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(nums[i], res);
        }
        return res;
    }
}
