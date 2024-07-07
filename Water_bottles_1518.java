package Leetcode;

public class Water_bottles_1518 {
    public static void main(String[] args) {
        int numBottles=9;
        int numExchange=3;
        Water_bottles_1518 ob=new Water_bottles_1518();
        System.out.println(ob.numWaterBottles(numBottles, numExchange));
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        while(numBottles>=numExchange)
        {
            int newBottles=numBottles/numExchange;
            int remBottles=numBottles % numExchange;
            res=res+newBottles;
            numBottles=newBottles+remBottles;
        }
        return res;
    }
}
