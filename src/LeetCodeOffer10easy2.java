public class LeetCodeOffer10easy2 {
    //f(0) = 1
    //f(1) = 1
    //f(2) = f(0) + f(1)
    public int numWays(int n) {
        int a = 1, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
