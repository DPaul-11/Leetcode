package Leetcode;
import java.util.*;
public class Goal_parser_interpretation_1678 {
    public static void main(String[] args) {
        String command="G()(al)";
        Goal_parser_interpretation_1678 ob=new Goal_parser_interpretation_1678();
        System.out.println(ob.interpret(command));
    }
    public String interpret(String command) {
        StringBuilder S=new StringBuilder(command.length());
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                S.append('G');
            }
            if(command.charAt(i)=='(')
            {
                if(command.charAt(i+1)==')')
                {
                    S.append('o');
                    i++;
                }
                else{
                    S.append("al");
                    i+=3;
                }
            }
        }
        return S.toString();
    }
}
