package Leetcode;
import java.util.*;

public class Special_array_with_x_elements_greater_than_or_equal_x_1608 {
    public static void main(String[] args) {
        int nums[]={3,5};
        Special_array_with_x_elements_greater_than_or_equal_x_1608 ob=new Special_array_with_x_elements_greater_than_or_equal_x_1608();
        System.out.println(ob.specialArray(nums));
    }
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=(n-i))
            {
                if(i==0 || nums[i-1]<(n-i))
                {
                    return n-i;
                }
            }
        }
        return -1;
    }
}
