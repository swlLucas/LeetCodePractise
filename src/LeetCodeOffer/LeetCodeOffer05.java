package LeetCodeOffer;

public class LeetCodeOffer05 {
    class Solution {
        public String replaceSpace(String s) {
            char[] chars = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                if (c == ' '){
                    sb.append("%20");
                } else {
                    sb.append(c);
                }

            }
            return sb.toString();
        }
    }
}
