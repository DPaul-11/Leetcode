package Leetcode;
import java.util.*;

public class Min_remove_to_make_valid_parentheses_1249 {
    public static void main(String[] args) {
        String s="lee(t(c)o)de)";
        Min_remove_to_make_valid_parentheses_1249 ob=new Min_remove_to_make_valid_parentheses_1249();
        System.out.println(ob.minRemoveToMakeValid(s));
    }
    public String minRemoveToMakeValid(String s) {
        char[] ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        Stack<Character> stk=new Stack<>();
        int left=0;
        int right=0;
        for(char c: ch)
        {
            if(c=='(')
            {
                left++;
            }
            if(c==')')
            {
                right++;
            }
            if(right>left)
            {
                right--;
                continue;
            }else{
                stk.push(c);
            }
        }
        while(!stk.isEmpty())
        {
            char c=stk.pop();
            if(left>right && c=='(')
            {
                left--;
            }else{
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}
