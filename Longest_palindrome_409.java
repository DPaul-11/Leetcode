package Leetcode;
import java.util.*;

public class Longest_palindrome_409 {
    public static void main(String[] args) {
        String s="abccccdd";
        Longest_palindrome_409 ob=new Longest_palindrome_409();
        System.out.println(ob.longestPalindrome(s));
    }
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<>();
        int len=0;
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
            {
                set.remove(c);
                len+=2;
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty())
        {
            len+=1;
        }
        return len;
    }
}
