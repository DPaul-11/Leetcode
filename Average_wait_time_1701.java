package Leetcode;

public class Average_wait_time_1701 {
    public static void main(String[] args) {
        int[][] customers={{1,2},{2,5},{4,3}};
        Average_wait_time_1701 ob=new Average_wait_time_1701();
        System.out.println(ob.averageWaitingTime(customers));
    }
    public double averageWaitingTime(int[][] customers) {
        int currTime=0;
        long totalwaitTime=0;
        for(int[] customer: customers)
        {
            int arrival=customer[0];
            int time=customer[1];
            if(currTime<arrival)
            {
                currTime=arrival;
            }
            int waitTime=currTime+time-arrival;
            totalwaitTime += waitTime;
            currTime += time;
        }
        return (double)totalwaitTime/customers.length;
    }
}
