package Leetcode;

public class Pass_the_pillow_2582 {
    public static void main(String[] args) {
        int n=4;
        int time=5;
        Pass_the_pillow_2582 ob=new Pass_the_pillow_2582();
        System.out.println(ob.passThePillow(n, time));
    }
    public int passThePillow(int n, int time) {
        int div=time/(n-1);
        int rem=time%(n-1);
        if(rem==0)
        {
            if(div%2==0)
            {
                return 1;
            }else{
                return n;
            }
        }else{
            if(div%2==0)
            {
                return 1+rem;
            }else{
                return n-rem;
            }
        }
    }
}
