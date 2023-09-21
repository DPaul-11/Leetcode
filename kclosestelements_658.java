package Leetcode;
import java.util.*;
public class kclosestelements_658 {
    public static void main(String[] args) {
        int[] nums={1,1,1,10};
        kclosestelements_658 ob=new kclosestelements_658();
        System.out.println(ob.findClosestElements(nums,2,3));
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x)
    {
        int left=0;
        int right=arr.length-k;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(x-arr[mid]>arr[mid+k]-x)
            {
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        List<Integer> res=new LinkedList<>();
        for(int i=left;i<left+k;i++)
        {
            res.add(arr[i]);
        }
        return res;
    }
}
