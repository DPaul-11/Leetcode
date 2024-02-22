package Leetcode;
import java.util.*;
public class Find_the_town_judge_997 {
    public static void main(String[] args) {
        int n=3;
        int trust[][]={{1,3},{2,3}};
        Find_the_town_judge_997 ob=new Find_the_town_judge_997();
        System.out.println(ob.findJudge(n, trust));
    }
    public int findJudge(int n, int[][] trust) {
        int[] trustcount=new int[n+1];

        for(int[] relation: trust)
        {
            trustcount[relation[0]]--;
            trustcount[relation[1]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(trustcount[i]==n-1)
            {
                return i;
            }
        }
        return -1;
    }
}
