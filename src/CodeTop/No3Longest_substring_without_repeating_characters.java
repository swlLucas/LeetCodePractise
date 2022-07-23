package CodeTop;

import java.util.HashSet;
import java.util.Set;

public class No3Longest_substring_without_repeating_characters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            //滑动窗口范围
            int right = -1, max = 0, n = s.length();
            Set<Character> chars = new HashSet<>();
            for (int i = 0; i < n; i++) {

                if (i != 0) {
                    chars.remove(s.charAt(i - 1));
                }

                while (right + 1 < n && !chars.contains(s.charAt(right + 1))) {
                    chars.add(s.charAt(right+1));
                    ++right;
                }

                max = Math.max(max, right - i + 1);
            }
            return max;
        }
    }
}
