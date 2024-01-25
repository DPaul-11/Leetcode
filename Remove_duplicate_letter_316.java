package Leetcode;
import java.util.*;
public class Remove_duplicate_letter_316 {
    public static void main(String[] args) {
        String s="adcbadcb";
        Remove_duplicate_letter_316 ob=new Remove_duplicate_letter_316();
        System.out.println(ob.removeDuplicateLetters(s));
    }public String removeDuplicateLetters(String s) {
        Stack<Character> stk=new Stack<>();
        int[] freq=new int[26];
        boolean exist[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']--;
            if(exist[ch-'a'])
            {
                continue;
            }
            while(stk.size()>0 && stk.peek()>ch && freq[stk.peek()-'a']>0)
            {
                char remove=stk.pop();
                exist[remove-'a']=false;
            }
            stk.push(ch);
            exist[ch-'a']=true;
        }
        char[] result=new char[stk.size()];
        int i=result.length-1;
        while(i>=0)
        {
            result[i--]=stk.pop();
        }
        return new String(result);
    }
}
