package Leetcode;

public class Remove_duplicate_from_sorted_array_II_80 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        Remove_duplicate_from_sorted_array_II_80 ob=new Remove_duplicate_from_sorted_array_II_80();
        System.out.println(ob.removeDuplicate(nums));
    }
    public int removeDuplicate(int[] nums)
    {
        int i=0;
        for(int n:nums)
        {
            if(i<2 || n!=nums[i-2])
            {
                nums[i++]=n;
            }
        }
        return i;
    }
}
