package LeetCodeOffer;

public class LeetCodeOffer11 {
    class Solution {
        public int minArray(int[] numbers) {
            //二分查找
            int right = numbers.length - 1;
            int left = 0, mid;
            while (left < right) {
                mid = left + (right - left)/2;
                if (numbers[mid] < numbers[right]) {
                    right = mid;
                } else if (numbers[mid] > numbers[right]) {
                    left = mid + 1;
                } else {
                    right--;
                }
            }
            return numbers[left];
        }
    }
}
