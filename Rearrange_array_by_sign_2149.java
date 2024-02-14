package Leetcode;
import java.util.*;
public class Rearrange_array_by_sign_2149 {
    public static void main(String[] args) {
        int nums[]={3,1,-2,-5,2,-4};
        Rearrange_array_by_sign_2149 ob=new Rearrange_array_by_sign_2149();
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        for(int num: nums)
        {
            if(num>0)
            {
                a.add(num);
            }else{
                b.add(num);
            }
        }
        int count=0;
        int c1=0;
        int c2=0;
        for(int num: nums)
        {
            if(count % 2==0)
            {
                int n=a.get(c1++);
                c.add(n);
            }else{
                int n=b.get(c2++);
                c.add(n);
            }
            count++;
        }
        int[] ans=new int[c.size()];
        for(int i=0;i<c.size();i++)
        {
            ans[i]=c.get(i);
        }
        return ans;
    }
}
