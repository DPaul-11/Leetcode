package Leetcode;
import java.util.*;

public class Subarray_product_less_than_k_713 {
    public static void main(String[] args) {
        int nums[]={10,5,2,6};
        int k=100;
        Subarray_product_less_than_k_713 ob=new Subarray_product_less_than_k_713();
        System.out.println(ob.numSubarrayProductLessThanK(nums, k));
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int s = 0;
        int e = 0;
        int prod = 1;
        int ans = 0;
        while(e < nums.length) {
            prod *= nums[e++];
            while(s < e && prod >= k) {
                prod /= nums[s++];
            }
            if(prod < k) {
                ans += e-s;
            }
        }
        return ans;
    }
}
