package Leetcode;
import java.util.*;
public class Maxproduct3nos {
    public static void main(String[] args) {
        int[] nums={-20,23,-12,34,4,9};
        Maxproduct3nos ob=new Maxproduct3nos();
        System.out.println(ob.maximumProduct(nums));
    }
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int p=1;
        if(n==3)
        {
            for(int i=0;i<n;i++)
            {
                p=p*nums[i];
            }
            return p;
        }
        p=Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
        return p;
    }
}
