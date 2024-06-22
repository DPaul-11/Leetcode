package Leetcode;
import java.util.*;

public class Count_no_of_nice_subarrays_1248 {
    public static void main(String[] args) {
        int[] nums={1,2,1,2,1,1};
        int k=3;
        Count_no_of_nice_subarrays_1248 ob=new Count_no_of_nice_subarrays_1248();
        System.out.println(ob.numberOfSubarrays(nums, k));
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int curr=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num: nums)
        {
            curr+= num%2;
            count+=map.getOrDefault(curr-k, 0);
            map.put(curr, map.getOrDefault(curr, 0)+1);
        }
        return count;
    }
}
