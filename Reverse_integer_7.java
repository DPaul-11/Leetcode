package Leetcode;

public class Reverse_integer_7 {
    public static void main(String[] args) {
        int x=1543;
        Reverse_integer_7 ob=new Reverse_integer_7();
        System.out.println(ob.reverse(x));
    }
    public int reverse(int x) {
        long num=0;
        while(x!=0)
        {
            int r=x%10;
            num=(num*10)+r;
            x=x/10;
        }
        if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE)
        {
            return 0;
        }
        if(x<0)
        {
            return (int)(-1*num);
        }
        return (int)num;
    }
}
