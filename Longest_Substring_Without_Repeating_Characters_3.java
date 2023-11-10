package Leetcode;
import java.util.*;
public class Longest_Substring_Without_Repeating_Characters_3 {
    public static void main(String[] args) {
        String s="abcabcbb";
        Longest_Substring_Without_Repeating_Characters_3 ob=new Longest_Substring_Without_Repeating_Characters_3();
        System.out.println(ob.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet();
        int n=s.length();
        int p1=0;
        int p2=0;
        int max=0;
        while(p2<n)
        {
            if(!(set.contains(s.charAt(p2))))
            {
                set.add(s.charAt(p2));
                p2++;
                max=Math.max(set.size(),max);
            }else{
                set.remove(s.charAt(p1));
                p1++;
            }
        }
        return max;
    }
}
