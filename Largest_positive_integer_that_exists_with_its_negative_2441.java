package Leetcode;
import java.util.*;

public class Largest_positive_integer_that_exists_with_its_negative_2441 {
    public static void main(String[] args) {
        int nums[]={-1,2,-3,3};
        Largest_positive_integer_that_exists_with_its_negative_2441 ob=new Largest_positive_integer_that_exists_with_its_negative_2441();
        System.out.println(ob.findMaxK(nums));
    }
    public int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int res=-1;
        for(int num:nums)
        {
            set.add(num);
            int n=num*(-1);
            if(set.contains(n))
            {
                res=Math.max(res, Math.abs(num));
            }
        }
        return res;
    }
}
