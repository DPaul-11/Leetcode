package Leetcode;

public class Max_nesting_depth_of_parantheses_1614 {
    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        Max_nesting_depth_of_parantheses_1614 ob=new Max_nesting_depth_of_parantheses_1614();
        System.out.println(ob.maxDepth(s));
    }
    public int maxDepth(String s) {
        int count=0;
        int maxCount=0;
        char[] ch=s.toCharArray();
        for(char c: ch)
        {
            if(c=='(')
            {
                count++;
                if(maxCount<count)
                {
                    maxCount=count;
                }
            }else if(c==')'){
                count--;
            }
        }
        return maxCount;
    }
}
