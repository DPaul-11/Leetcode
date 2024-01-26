package Leetcode;
import java.util.*;
public class Product_of_array_except_self {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int product=1;
        int a=1;
        for(int i=0;i<nums.length;i++)
        {
            answer[i]=product;
            product=product*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            answer[i]=answer[i]*a;
            a=a*nums[i];
        }
        return answer;
    }
}
