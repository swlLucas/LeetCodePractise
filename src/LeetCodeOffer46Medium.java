

public class LeetCodeOffer46Medium {
    class Solution {
        public int translateNum(int num) {
            String temp = String.valueOf(num);
            int[] dp = new int[temp.length()+1];
            //dp[i]对应num第i位的方案数 i > 0
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= temp.length(); i++) {
                String cur = temp.substring(i-2, i);
                if (cur.compareTo("10") >= 0 && cur.compareTo("25") <= 0) {
                    dp[i] = dp[i-1] + dp[i-2];
                } else {
                    dp[i] = dp[i-1];
                }
            }
            return dp[temp.length()];
        }
    }
}
