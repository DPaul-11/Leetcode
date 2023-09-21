package Leetcode;

public class Mergesortedarray_88 {
    public static void main(String[] args) {
        int[] nums1 ={1,2,7,0,0,0};
        int[] nums2={2,4,6};
        int m= nums1.length;
        int n= nums2.length;
        Mergesortedarray_88 ob=new Mergesortedarray_88();
        ob.merge(nums1,m,nums2,n);
        System.out.println();
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = i+j+1;//m+n-1
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

}
