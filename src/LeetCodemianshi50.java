import java.util.HashSet;

public class LeetCodemianshi50 {
    class Solution {
        public char firstUniqChar(String s) {
            int size = s.length();
            int[] count = new int[26];
            for (int i = 0; i < size; i++) {
                count[s.charAt(i)-97]++;
            }
            for (int i = 0; i < size; i++) {
                if (count[s.charAt(i)-97] == 1){
                    return s.charAt(i);
                }
            }
            return ' ';
        }
    }
}
