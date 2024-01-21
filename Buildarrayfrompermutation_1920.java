package Leetcode;
import java.util.*;
public class Buildarrayfrompermutation_1920 {
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        Buildarrayfrompermutation_1920 ob=new Buildarrayfrompermutation_1920();
        System.out.println(ob.buildArray(nums));
    }
    public int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}
