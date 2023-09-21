package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMax {
    public static void main(String[] args) {
        int[] nums={3,1,4,2,5};
        ThirdMax ob=new ThirdMax();
        System.out.println(ob.thirdMax(nums));
    }
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)
        {
            hs.add(i);
        }
        int[] arr=new int[hs.size()];
        int k=0;
        for(int i:hs)
        {
            arr[k]=i;
            k++;
        }
        Arrays.sort(arr);
        if(arr.length<3)
        {
            return arr[arr.length-1];
        }
        else {
            return arr[arr.length-3];
        }
    }
}
