package Leetcode;
import java.util.*;

public class Reverse_substrings_bw_each_pair_of_parentheses_1190 {
    public static void main(String[] args) {
        String s="(u(love)i)";
        Reverse_substrings_bw_each_pair_of_parentheses_1190 ob=new Reverse_substrings_bw_each_pair_of_parentheses_1190();
        System.out.println(ob.reverseParentheses(s));
    }
    public String reverseParentheses(String s) {
        int n=s.length();
        Stack<Integer> stack=new Stack<>();
        int[] pair=new int[n];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }else if(s.charAt(i)==')'){
                int j=stack.pop();
                pair[i]=j;
                pair[j]=i;
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        int direction=1;
        while(i<n)
        {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            {
                i=pair[i];
                direction=-direction;
            }else{
                sb.append(s.charAt(i));
            }
            i+=direction;
        }
        return sb.toString();
    }
}
