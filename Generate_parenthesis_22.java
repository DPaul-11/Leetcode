package Leetcode;
import java.util.*;
public class Generate_parenthesis_22 {
    public static void main(String[] args) {
        int n=3;
        Generate_parenthesis_22 ob=new Generate_parenthesis_22();
        System.out.println(ob.generateParenthesis(n));
    }
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        brackets("(",1,0,result,n);
        return result;
    }
    public void brackets(String S,int open,int close,List<String> result, int n)
    {
        if(S.length()==2*n)
        {
            result.add(S);
            return;
        }
        if(open<n)
        {
            brackets(S+"(",open+1,close,result,n);
        }
        if(close<open)
        {
            brackets(S+")",open,close+1,result,n);
        }
    }
}
