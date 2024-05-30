package Leetcode;

public class Count_triplets_that_can_form_2arrays_of_equal_xor_1442 {
    public static void main(String[] args) {
        int[] arr={2,3,1,6,7};
        Count_triplets_that_can_form_2arrays_of_equal_xor_1442 ob=new Count_triplets_that_can_form_2arrays_of_equal_xor_1442();
        System.out.println(ob.countTriplets(arr));
    }
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                val=val^arr[j];
                if(val==0)
                {
                    count+=(j-i);
                }
            }
        }
        return count;
    }
}
