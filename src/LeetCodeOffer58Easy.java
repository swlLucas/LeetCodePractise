public class LeetCodeOffer58Easy {
    class Solution {
        public String reverseWords(String s) {
            int left = s.length() - 1, right = s.length() - 1;
            StringBuffer sb = new StringBuffer();
            while (left >= 0) {
                while (left >= 0 && s.charAt(left) != ' ') {
                    --left;
                }
                sb.append(s.substring(left+1, right+1) + " ");
                while (left >= 0 && s.charAt(left) == ' ') {
                    --left;
                }
                right = left;
            }
            return sb.toString().trim();
        }
    }
}
