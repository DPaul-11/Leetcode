package Leetcode;
import java.util.*;
public class Min_diff_bw_largest_smallest_values_in_3_moves_1509 {
    public static void main(String[] args) {
        int[] nums={1,5,0,10,14};
        Min_diff_bw_largest_smallest_values_in_3_moves_1509 ob=new Min_diff_bw_largest_smallest_values_in_3_moves_1509();
        System.out.println(ob.minDifference(nums));
    }
    public int minDifference(int[] nums) {
        if(nums.length<=4)
        {
            return 0;
        }
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=3;i++)
        {
            ans=Math.min(ans, nums[nums.length-4+i]-nums[i]);
        }
        return ans;
    }
}
