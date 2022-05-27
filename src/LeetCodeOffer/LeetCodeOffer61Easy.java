package LeetCodeOffer;

import java.util.HashSet;

public class LeetCodeOffer61Easy {
    class Solution {
        public boolean isStraight(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int max = 0, min = 14;
            for (int num : nums) {
                if (num == 0) continue;
                max = Math.max(num, max);
                min = Math.min(num, min);
                if (!set.add(num)) return false;
            }
            return max - min < 5;
        }
    }
}
