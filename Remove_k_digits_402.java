package Leetcode;
import  java.util.*;

public class Remove_k_digits_402 {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        Remove_k_digits_402 ob=new Remove_k_digits_402();
        System.out.println(ob.removeKdigits(num, k));
    }
    public String removeKdigits(String num, int k) {
        Stack<Character> stk=new Stack<>();
        char[] digits=num.toCharArray();
        for(char digit: digits)
        {
            while(!stk.isEmpty() && k>0 && stk.peek()>digit)
            {
                stk.pop();
                k--;
            }
            stk.push(digit);
        }
        while(k>0 && !stk.isEmpty())
        {
            stk.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty())
        {
            sb.append(stk.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        if(sb.length()==0)
        {
            return "0";
        }
        return sb.toString();
    }
}
