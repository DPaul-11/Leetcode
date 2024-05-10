package Leetcode;

import java.util.Arrays;

public class Kth_smallest_prime_fraction_786 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int k=3;
        Kth_smallest_prime_fraction_786 ob=new Kth_smallest_prime_fraction_786();
        System.out.println(Arrays.toString(ob.kthSmallestPrimeFraction(arr, k)));
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n=arr.length;
        double left=0;
        double right=1;
        double mid;
        int[] ans=new int[2];
        while(left<=right)
        {
            mid=left+(right-left)/2;
            int j=1;
            int total=0;
            int num=0;
            int den=0;
            double maxFrac=0;
            for(int i=0;i<n;i++)
            {
                while(j<n && arr[i]>=arr[j]*mid)
                {
                    ++j;
                }
                total+=n-j;
                if(j<n && maxFrac<arr[i]*1.0/arr[j])
                {
                    maxFrac=arr[i]*1.0/arr[j];
                    num=i;
                    den=j;
                }
            }
            if(total==k)
            {
                ans[0]=arr[num];
                ans[1]=arr[den];
                break;
            }
            if(total>k)
            {
                right=mid;
            }else{
                left=mid;
            }
        }
        return ans;
    }
}
