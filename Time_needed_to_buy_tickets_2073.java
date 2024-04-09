package Leetcode;

import java.sql.Time;

public class Time_needed_to_buy_tickets_2073 {
    public static void main(String[] args) {
        int tickets[]={2,3,2};
        int k=2;
        Time_needed_to_buy_tickets_2073 ob=new Time_needed_to_buy_tickets_2073();
        System.out.println(ob.timeRequiredToBuy(tickets, k));
    }
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        while(true)
        {
            for(int i=0;i<tickets.length;i++)
            {
                if(tickets[i]>0)
                {
                    tickets[i]=tickets[i]-1;
                    time++;
                }
                if(i==k && tickets[i]==0)
                {
                    return time;
                }
            }
        }
    }
}
