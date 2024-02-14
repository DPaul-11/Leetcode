package Leetcode;
import java.util.*;
public class Merge_interval_56 {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        Merge_interval_56 ob=new Merge_interval_56();
        System.out.println(ob.merge(intervals));
    }
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
        {
            return intervals;
        }
        Arrays.sort(intervals, (arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        List<int[]> result=new ArrayList<>();
        int[] curr_interval=intervals[0];
        result.add(curr_interval);

        for(int[] interval: intervals)
        {
            int curr_beg=curr_interval[0];
            int curr_end=curr_interval[1];
            int next_beg=interval[0];
            int next_end=interval[1];

            if(curr_end>=next_beg)
            {
                curr_interval[1]=Math.max(curr_end,next_end);
            }else{
                curr_interval=interval;
                result.add(curr_interval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
