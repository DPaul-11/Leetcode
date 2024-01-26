package Leetcode;

public class Gas_station_134 {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        Gas_station_134 ob=new Gas_station_134();
        System.out.println(ob.canCompleteCircuit(gas, cost));
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int position=0;
        int sum=0;
        int total=0;
        for(int i=0;i<gas.length;i++)
        {
            sum=sum+(gas[i]-cost[i]);
            if(sum<0)
            {
                total=total+sum;
                sum=0;
                position=i+1;
            }
        }
        total=total+sum;
        if(total>=0)
        {
            return position;
        }else{
            return -1;
        }
    }
}
