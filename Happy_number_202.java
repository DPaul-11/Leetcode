package Leetcode;
import java.util.*;

public class Happy_number_202 {
    public static void main(String[] args) {
        Boolean result=Happy_number_202.isHappy(19);
        System.out.println(result);
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=0 && !set.contains(n))
        {
            set.add(n);
            int sum=0;
            while(n!=0)
            {
                int r=n%10;
                sum=sum+(r*r);
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}
