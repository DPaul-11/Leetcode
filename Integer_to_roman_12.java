package Leetcode;
import java.util.*;
public class Integer_to_roman_12 {
    public static void main(String[] args) {
        int num=51;
        Integer_to_roman_12 ob=new Integer_to_roman_12();
        System.out.println(ob.intToRoman(num));
    }
    public String intToRoman(int num) {
        int []values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(num>0)
        {
            if(num>=values[i])
            {
                sb.append(symbol[i]);
                num=num-values[i];
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}
