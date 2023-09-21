package Leetcode;
import java.util.*;
public class Validparenthesis_20 {
    public static void main(String[] args) {
    String s="({[]})";
    Validparenthesis_20 ob=new Validparenthesis_20();
    Boolean result=ob.isValid(s);
    System.out.println(result);
    }
    public boolean isValid(String s) {
        int l=s.length();
        Stack<Character> c= new Stack<>();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                c.push(s.charAt(i));
            }
            else{
                if(c.empty())
                {
                    return false;
                }
                if((s.charAt(i)==')' && c.peek()=='(') || (s.charAt(i)=='}' && c.peek()=='{') || (s.charAt(i)==']' && c.peek()=='['))
                {
                    c.pop();
                }else{
                    return false;
                }
            }

        }
        if(c.empty())
            return true;

        return false;

    }
}
