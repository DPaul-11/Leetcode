package Leetcode;
import java.util.*;

public class Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times_2962 {
    public static void main(String[] args) {
        int nums[]={1,3,2,3,3};
        int k=2;
        Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times_2962 ob=new Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times_2962();
        System.out.println(ob.countSubarrays(nums, k));
    }
    public long countSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        long count=0;
        long maxNum=Long.MIN_VALUE;
        long left=0;
        long right=0;
        long res=0;
        for(int num: nums)
        {
            maxNum=Math.max(maxNum, num);
        }
        while(right<nums.length || left>right)
        {
            if(nums[(int)right]==maxNum)
            {
                count++;
            }
            while(count>=k)
            {
                if(nums[(int)left]==maxNum)
                {
                    count--;
                }
                left++;
                res+=nums.length-right;
            }
            right++;
        }
        return res;
    }
}
