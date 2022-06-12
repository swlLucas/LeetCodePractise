package LeetCodeOffer;

import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCodeOffer41Hard {
    class MedianFinder {

        //大顶堆小顶堆
        Queue<Integer> A, B;
        /** initialize your data structure here. */
        public MedianFinder() {
            //A是小顶堆，储存较大的一半
            //B是大顶堆，储存较小的一半
            //A.size >= B.size
            A = new PriorityQueue<Integer>();
            B = new PriorityQueue<>((x, y) -> (y - x));
        }

        public void addNum(int num) {
            // A.size() == B.size() ==> 往A里添加数据
            // 往B里添加数据
            if (A.size() == B.size()) {
                B.add(num);
                A.add(B.poll());
            } else {
                A.add(num);
                B.add(A.poll());
            }
        }

        public double findMedian() {
            return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
        }
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
