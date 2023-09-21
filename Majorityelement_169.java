package Leetcode;
import java.util.*;

public class Majorityelement_169 {
    public static void main(String[] args) {
        int[] nums={2,2,1,3,1,3,2,2,5,5,6,6,1,1};
    Majorityelement_169 ob=new Majorityelement_169();
    System.out.println(ob.majorityElement(nums));
    }
    public int majorityElement(int[] nums) {
        int n=nums.length;

        Arrays.sort(nums);
        int idx=0;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[idx])
            {
                count++;
            }
            else{
                count--;
            }
            if(count==0)
            {
                count=1;
                idx=i;
            }
        }
        return nums[idx];
    }
}
