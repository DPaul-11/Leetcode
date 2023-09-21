package Leetcode;
import java.util.*;
public class reversewords_151 {
    public static void main(String[] args) {
        String s="The sky is blue";
        reversewords_151 ob=new reversewords_151();
        System.out.println(ob.reverseWords(s));
    }
    public String reverseWords(String s) {

        String[] strArr=s.split(" ");
        StringBuilder sa=new StringBuilder();
        for(int i=strArr.length-1;i>=0;i--)
        {
            if(strArr[i]==""){
                continue;
            }
            sa=sa.append(strArr[i]+" ");

        }
        return sa.toString().trim();
    }
}
