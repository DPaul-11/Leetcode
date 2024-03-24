package Leetcode;
import java.util.*;

public class Find_duplicate_no_287 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,2};
        Find_duplicate_no_287 ob=new Find_duplicate_no_287();
        System.out.println(ob.findDuplicate(nums));
    }
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }
}
