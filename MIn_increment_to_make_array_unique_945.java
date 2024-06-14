package Leetcode;
import java.util.*;

public class MIn_increment_to_make_array_unique_945 {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        MIn_increment_to_make_array_unique_945 ob=new MIn_increment_to_make_array_unique_945();
        System.out.println(ob.minIncrementForUnique(nums));
    }
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int tracker=0;
        int inc=0;
        for(int num:nums)
        {
            tracker=Math.max(tracker, num);
            inc+=tracker-num;
            tracker+=1;
        }
        return inc;
    }
}
