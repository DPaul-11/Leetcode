package Leetcode;
import java.util.*;

public class Longest_consecutive_seq_128 {
    public static void main(String[] args) {
        int nums[]={100,4,200,1,3,2};
        Longest_consecutive_seq_128 ob=new Longest_consecutive_seq_128();
        System.out.println(ob.longestConsecutive(nums));

    }
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums)
        {
            set.add(num);
        }
        int max_length=0;
        for(int i=0;i<nums.length;i++)
        {
            int current_num=nums[i];
            int current_length=1;
            if(!set.contains(current_num-1))
            {
                while(set.contains(current_num+1))
                {
                    current_num+=1;
                    current_length+=1;
                }
                max_length=Math.max(max_length,current_length);
            }
        }
        return max_length;
    }
}
