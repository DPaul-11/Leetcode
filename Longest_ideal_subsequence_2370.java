package Leetcode;

public class Longest_ideal_subsequence_2370 {
    public static void main(String[] args) {
        String s="acfgbd";
        int k=2;
        Longest_ideal_subsequence_2370 ob=new Longest_ideal_subsequence_2370();
        System.out.println(ob.longestIdealString(s, k));
    }
    public int longestIdealString(String s, int k) {
        int ans=0;
        int[] dp=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int element=s.charAt(i)-'a';
            for(int j=element;j>=0 && j>=element-k;j--)
            {
                dp[element]=Math.max(dp[element], dp[j]+1);
            }
            for(int j=element+1;j<26 && j<=element+k;j++)
            {
                dp[element]=Math.max(dp[element], dp[j]+1);
            }
            ans=Math.max(ans, dp[element]);
        }
        return ans;
    }
}
