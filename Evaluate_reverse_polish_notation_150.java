package Leetcode;
import java.util.*;
public class Evaluate_reverse_polish_notation_150 {
    public static void main(String[] args) {
        String tokens[]={"2","1","+","3","*"};
        Evaluate_reverse_polish_notation_150 ob=new Evaluate_reverse_polish_notation_150();
        System.out.println(ob.evalRPN(tokens));
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(String token: tokens)
        {
            if("+".equals(token) || "-".equals(token) || "/".equals(token) || "*".equals(token))
            {
                int num1=stk.pop();
                int num2=stk.pop();
                stk.push(calculate(num1,num2,token));
            }else{
                stk.push(Integer.parseInt(token));
            }
        }
        return stk.pop();
    }
    private int calculate(int num1, int num2, String token)
    {
        int ans=0;
        if("+".equals(token))
        {
            ans=num2+num1;
        }
        if("-".equals(token))
        {
            ans=num2-num1;
        }
        if("/".equals(token))
        {
            ans=num2/num1;
        }
        if("*".equals(token))
        {
            ans=num2*num1;
        }
        return ans;
    }
}
