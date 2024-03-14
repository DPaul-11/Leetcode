package Leetcode;

public class Binary_subarrays_with_sum_930 {
    public static void main(String[] args) {
        int[] nums={1,0,1,0,1};
        int goal=2;
        Binary_subarrays_with_sum_930 ob=new Binary_subarrays_with_sum_930();
        System.out.println(ob.numSubarraysWithSum(nums, goal));
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum=sum+nums[j];
                if(sum==goal)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
