package Leetcode;
import java.util.*;

public class Shufflethearray_1470 {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        Shufflethearray_1470 ob=new Shufflethearray_1470();
        System.out.println(ob.shuffle(nums,n));
    }
    public int[] shuffle(int[] nums, int n) {
        int k=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i+=2)
        {
            arr[i]=nums[k++];
        }
        for(int j=1;j<nums.length;j+=2)
        {
            arr[j]=nums[n++];
        }
        return arr;
    }
}
