package Leetcode;

public class Score_of_a_string_3110 {
    public static void main(String[] args) {
        String s="hello";
        Score_of_a_string_3110 ob=new Score_of_a_string_3110();
        System.out.println(ob.scoreOfString(s));
    }
    public int scoreOfString(String s) {
        int c=0;
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            c=Math.abs(s.charAt(i+1)-s.charAt(i));
            sum=sum+c;
        }
        return sum;
    }
}
