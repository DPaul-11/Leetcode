package Leetcode;
import java.util.*;

public class Multiply_strings_43 {
    public static void main(String[] args) {
        String num1="2";
        String num2="3";
        Multiply_strings_43 ob=new Multiply_strings_43();
        System.out.println(ob.multiply(num1,num2));
    }
    public String multiply(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        int[] product=new int[l1+l2];
        for(int i=l1-1;i>=0;i--)
        {
            for(int j=l2-1;j>=0;j--)
            {
                int n1=num1.charAt(i)-'0';
                int n2=num2.charAt(j)-'0';
                int multiply=n1*n2;
                product[i+j+1]+=n1*n2;
            }
        }
        int carry=0;
        for(int i=product.length-1;i>=0;i--)
        {
            int temp=(product[i]+carry)%10;
            carry=(product[i]+carry)/10;
            product[i]=temp;
        }
        StringBuilder sb=new StringBuilder();
        for(int num:product)
        {
            sb.append(num);
        }
        while(sb.length()!=0 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        return sb.length()==0 ? "0" : sb.toString();
    }
}
