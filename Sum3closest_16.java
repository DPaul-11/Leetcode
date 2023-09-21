package Leetcode;
import java.util.*;
public class Sum3closest_16 {
    public static void main(String[] args) {
        int[] nums={-1,2,1,4};
        int target=1;
        Sum3closest_16 ob=new Sum3closest_16();
        System.out.println(ob.threeSumClosest(nums, target));
    }
    int threeSumClosest(int[] nums, int target)
    {
        Arrays.sort(nums);
        int resultSum=nums[0]+nums[1]+nums[2];
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target)
                {
                    return target;
                }
                if(sum<target)
                {
                    left++;
                }
                else{
                    right--;
                }
                int diffToTarget=Math.abs(sum-target);
                if(diffToTarget<minDiff)
                {
                    resultSum=sum;
                    minDiff=diffToTarget;
                }
            }
        }
        return resultSum;
    }
}
