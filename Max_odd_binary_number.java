package Leetcode;
import java.util.*;

public class Max_odd_binary_number {
    public static void main(String[] args) {
        String s="0101";
        Max_odd_binary_number ob=new Max_odd_binary_number();
        System.out.println(ob.maximumOddBinaryNumber(s));
    }
    public String maximumOddBinaryNumber(String s) {
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0; i < ch.length / 2; i++) {
            char j = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = j;
        }
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i]=='1')
            {
                char temp=ch[i];
                ch[i]=ch[ch.length-1];
                ch[ch.length-1]=temp;
                break;
            }
        }
        return new String(ch);
    }
}
