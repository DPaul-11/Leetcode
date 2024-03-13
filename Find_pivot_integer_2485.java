package Leetcode;

public class Find_pivot_integer_2485 {
    public static void main(String[] args) {
        int n=8;
        Find_pivot_integer_2485 ob=new Find_pivot_integer_2485();
        System.out.println(ob.pivotInteger(n));
    }
    public int pivotInteger(int n) {
        int left=1;
        int right=n;
        int sum=(n*(n+1))/2;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int firstSum=(mid*(mid+1))/2;
            int secondSum=sum-firstSum+mid;
            if(firstSum==secondSum)
            {
                return mid;
            }else if(firstSum<secondSum){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
