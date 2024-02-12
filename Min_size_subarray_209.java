package Leetcode;
import java.util.*;
public class Min_size_subarray_209 {
    public static void main(String[] args) {
        int nums[]={2,3,1,2,4,3};
        int target=7;
        Min_size_subarray_209 ob=new Min_size_subarray_209();
        System.out.println(ob.minSubArrayLen(target,nums));
    }
    public int minSubArrayLen(int target, int[] nums) {
        int result=Integer.MAX_VALUE;
        int left=0;
        int val_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            val_sum+=nums[i];
            while(val_sum>=target)
            {
                result=Math.min(result,i+1-left);
                val_sum-=nums[left];
                left++;
            }
        }
        return (result !=Integer.MAX_VALUE)? result: 0;
    }
}
