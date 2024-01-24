package Leetcode;

public class Split_balanced_string_1221 {
    public static void main(String[] args) {
        String s="RLRLRLRL";
        Split_balanced_string_1221 ob=new Split_balanced_string_1221();
        System.out.println(ob.balancedStringSplit(s));
    }
    public int balancedStringSplit(String s) {
        int c=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                c++;
            }else{
                c--;
            }
            if(c==0)
            {
                count++;
            }
        }
        return count;
    }
}
