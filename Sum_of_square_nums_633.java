package Leetcode;

public class Sum_of_square_nums_633 {
    public static void main(String[] args) {
        int c=5;
        Sum_of_square_nums_633 ob=new Sum_of_square_nums_633();
        System.out.println(ob.judgeSquareSum(c));
    }
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right)
        {
            if(left*left + right*right ==c)
            {
                return true;
            }else if(left*left + right*right>c){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}
