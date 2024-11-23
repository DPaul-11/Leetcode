package Leetcode;

import java.util.Arrays;

public class Plus_one_66 {
    public static void main(String[] args) {
        int[] digits={4,3,2,1};
        Plus_one_66 ob=new Plus_one_66();
        System.out.println(Arrays.toString(ob.plusOne(digits)));
    }
    public int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
