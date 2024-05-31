package Leetcode;
import java.util.*;

public class Single_number_III_260 {
    public static void main(String[] args) {
        int[] nums={1,2,1,3,2,5};
        Single_number_III_260 ob=new Single_number_III_260();
        System.out.println(Arrays.toString(ob.singleNumber(nums)));
    }
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        int k=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num: nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1)
            {
                res[k++]=entry.getKey();
                if(k==2)
                {
                    break;
                }
            }
        }
        return res;
    }
}
