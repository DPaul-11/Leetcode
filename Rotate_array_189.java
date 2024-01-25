package Leetcode;
import java.util.*;
public class Rotate_array_189 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }
    public static int[] rotate(int[] nums, int k) {
        int l=nums.length;
        k=k%l;
        reverse(nums,0,l-1);
        reverse(nums,0,k-1);
        reverse(nums,k,l-1);
        return nums;
    }
    public static void reverse(int[] nums, int beg, int end)
    {
        while(beg<end)
        {
            int temp=nums[beg];
            nums[beg]=nums[end];
            nums[end]=temp;
            beg++;
            end--;
        }
    }
}
