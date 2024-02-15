package Leetcode;
import java.util.*;
public class Polygon_with_largest_perimeter {
    public static void main(String[] args) {
        int nums[]={1,12,1,2,5,50,3};
        Polygon_with_largest_perimeter ob=new Polygon_with_largest_perimeter();
        System.out.println(ob.largestPerimeter(nums));
    }
    public long largestPerimeter(int[] nums) {
        if(nums.length<3)
        {
            return 0;
        }
        long perimeter=0;
        long ans=-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<perimeter)
            {
                ans=nums[i]+perimeter;
            }
            perimeter+=nums[i];
        }
        return ans;
    }
}
