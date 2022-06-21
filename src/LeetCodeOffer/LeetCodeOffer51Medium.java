package LeetCodeOffer;

public class LeetCodeOffer51Medium {
    class Solution {
        public int sumNums(int n) {
            boolean a = n > 1 && (n += sumNums(n - 1)) > 0;
            return n;
        }
    }
}
