package Leetcode;
import java.util.*;
public class Jump_game_II_45 {
    public static void main(String[] args) {
        int[] nums={2,4,1,2,3,1,1,2};
        Jump_game_55 ob=new Jump_game_55();
        System.out.println(ob.canJump(nums));
    }
    public int jump(int[] nums) {
        int destination=nums.length-1;
        int totaljumps=0;
        int coverage=0;
        int lastjumpidx=0;
        if(nums.length==1)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            coverage=Math.max(coverage,i+nums[i]);
            if(i==lastjumpidx)
            {
                lastjumpidx=coverage;
                totaljumps++;

                if(coverage>=destination)
                {
                    return totaljumps;
                }
            }
        }
        return totaljumps;
    }
}
