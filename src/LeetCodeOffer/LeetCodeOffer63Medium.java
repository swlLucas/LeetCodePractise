package LeetCodeOffer;

public class LeetCodeOffer63Medium {
    //dp
    //min记录股票最低值
    //res记录股票买入后产生的最大收益
    public int maxProfit(int[] prices) {
        int min = prices[0], res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            } else {
                res = Math.max(res, prices[i] - min);
            }
        }
        return res;
    }
}
