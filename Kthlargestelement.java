package Leetcode;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Collections;
public class Kthlargestelement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Kthlargestelement ob = new Kthlargestelement();
        System.out.println(ob.findKthLargest(nums, k));
    }


    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for (int num = 0; num < nums.length; num++) {
            min.offer(nums[num]);

            if (min.size() > k) {
                min.poll();
            }
        }

        return min.peek();
    }
}