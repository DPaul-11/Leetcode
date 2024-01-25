package Leetcode;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,2,4};
        Best_Time_to_Buy_and_Sell_Stock_II_122 ob=new Best_Time_to_Buy_and_Sell_Stock_II_122();
        System.out.println(ob.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int profit=0;
        int diff=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                diff=prices[i]-prices[i-1];
                profit=profit+diff;
            }
        }
        return profit;
    }
}
