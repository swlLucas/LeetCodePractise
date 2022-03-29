import java.util.HashSet;
import java.util.Set;

public class LeetCodeOffer48Medium {
    class Solution {
        //滑动窗口
        public int lengthOfLongestSubstring(String s) {
            int max = 0;
            Set<Character> temp = new HashSet<>();
            for (int l = 0, r = 0; r < s.length(); r++) {
                char cur = s.charAt(r);
                while (temp.contains(cur)) {
                    temp.remove(s.charAt(l++));
                }
                temp.add(cur);
                max = Math.max(max, temp.size());
            }
            return max;
        }
    }
}
