package Leetcode;
import java.util.*;

public class Count_elements_with_max_freq_3005 {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        Count_elements_with_max_freq_3005 ob=new Count_elements_with_max_freq_3005();
        System.out.println(ob.maxFrequencyElements(nums));
    }
    public int maxFrequencyElements(int[] nums) {
        int max_freq=0;
        int total_freq=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
            max_freq=Math.max(max_freq, map.get(num));
        }
        for(int freq: map.values())
        {
            if(freq==max_freq)
            {
                total_freq+=freq;
            }
        }
        return total_freq;
    }
}
