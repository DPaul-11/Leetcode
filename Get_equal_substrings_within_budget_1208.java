package Leetcode;

public class Get_equal_substrings_within_budget_1208 {
    public static void main(String[] args) {
        String s = "abcd", t = "bcdf";
        int maxCost = 3;
        Get_equal_substrings_within_budget_1208 ob=new Get_equal_substrings_within_budget_1208();
        System.out.println(ob.equalSubstring(s, t, maxCost));
    }
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLength=0;
        int left=0;
        int cost=0;
        for(int right=0;right<s.length();right++)
        {
            cost+=Math.abs(s.charAt(right)-t.charAt(right));
            while(cost>maxCost)
            {
                cost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            maxLength=Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
