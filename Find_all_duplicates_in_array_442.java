package Leetcode;
import java.util.*;

public class Find_all_duplicates_in_array_442 {
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        
        Find_all_duplicates_in_array_442 ob=new Find_all_duplicates_in_array_442();
        System.out.println(ob.findDuplicates(nums));
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] < 0) {
                ans.add(x);
            }
            nums[x - 1] *= -1;
        }
        return ans;
    }
}

