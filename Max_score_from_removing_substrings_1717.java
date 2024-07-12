package Leetcode;

public class Max_score_from_removing_substrings_1717 {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int x = 4, y = 5;
        Max_score_from_removing_substrings_1717 ob=new Max_score_from_removing_substrings_1717();
        System.out.println(ob.maximumGain(s,x,y));
    }
    public int maximumGain(String s, int x, int y) {
        int n=s.length();
        int points=0;
        int countA=0;
        int countB=0;
        int less=Math.min(x,y);
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch>'b')
            {
                points +=Math.min(countA, countB)*less;
                countA=0;
                countB=0;
            }else if(ch=='a'){
                if(x<y && countB>0)
                {
                    countB--;
                    points +=y;
                }else{
                    countA++;
                }
            }else{
                if(x>y && countA>0)
                {
                    countA--;
                    points+=x;
                }else{
                    countB++;
                }
            }
        }
        points +=Math.min(countA, countB)*less;
        return points;
    }
}
