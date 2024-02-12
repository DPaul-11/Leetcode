package Leetcode;
import java.util.*;

public class Contains_duplicate_II_219 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        int k=3;
    Boolean result=Contains_duplicate_II_219.containsNearbyDuplicate(nums,k);
    System.out.println(result);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        if(k==0)
        {
            return false;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]) && (i-map.get(nums[i]))<=k)
            {
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
