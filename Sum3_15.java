package Leetcode;
import java.util.*;
import java.util.ArrayList;

public class Sum3_15 {
    public static void main(String[] args) {
        int[] nums={-4,-1,-1,0,1,2};
        Sum3_15 ob=new Sum3_15();
        System.out.println(ob.threesum(nums));

    }
    List<List<Integer>> threesum(int[] nums)
    {
        if(nums==null || nums.length<3)
        {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        HashSet<List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
