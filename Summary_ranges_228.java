package Leetcode;
import java.util.*;
public class Summary_ranges_228 {
    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,7};
        Summary_ranges_228 ob=new Summary_ranges_228();
        System.out.println(ob.summaryRanges(nums));
    }
    public List<String> summaryRanges(int[] nums)
    {
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i< nums.length;i++)
        {
            int start=nums[i];
            while(i+1< nums.length && nums[i]+1==nums[i+1])
            {
                i++;
            }
            if(start!=nums[i])
            {
                ans.add(""+start+"->"+nums[i]);
            }else{
                ans.add(""+start);
            }
        }
        return ans;
    }
}
