package Leetcode;
import java.util.*;
public class Arrows_to_burst_balloons_452 {
    public static void main(String[] args) {
        int points[][]={{10,16},{2,8},{1,6},{7,12}};
        Arrows_to_burst_balloons_452 ob=new Arrows_to_burst_balloons_452();
        System.out.println(ob.findMinArrowShots(points));
    }
    public int findMinArrowShots(int[][] points) {
        int count=1;
        Arrays.sort(points, (arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        int end=points[0][1];
        for(int[] point: points)
        {
            if(point[0]<=end)
            {
                end=Math.min(end,point[1]);
            }else{
                end=point[1];
                count++;
            }
        }
        return count;
    }
}
