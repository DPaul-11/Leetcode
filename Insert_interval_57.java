package Leetcode;
import java.util.*;
public class Insert_interval_57 {
    public static void main(String[] args) {
        int intervals[][]={{1,3},{6,9}};
        int newInterval[]={2,5};
        Insert_interval_57 ob=new Insert_interval_57();
        System.out.println(Arrays.deepToString(ob.insert(intervals,newInterval)));
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result=new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0])
        {
            result.add(intervals[i++]);
        }
        while(i<intervals.length && intervals[i][0]<=newInterval[1])
        {
            newInterval=new int[]{
                    Math.min(intervals[i][0],newInterval[0]),
                    Math.max(intervals[i][1],newInterval[1])
            };
            i++;
        }
        result.add(newInterval);
        while(i<intervals.length)
        {
            result.add(intervals[i++]);
        }
        return result.toArray(new int[result.size()][]);
    }
}
