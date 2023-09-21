package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Largestnumber_179
{
    public static void main(String[] args) {
        int[] nums={2,10};
    Largestnumber_179 ob=new Largestnumber_179();
    System.out.println(ob.largestNumber(nums));
    }
    public String largestNumber(int[] nums)
    {
        if(nums.length==0)
        {
            return "";
        }
        String[] sa=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sa[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(sa, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String o1=a+b;
                String o2=b+a;
                return o2.compareTo(o1);
            }
        });
        if(sa[0].equals("0"))
        {
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String s: sa)
        {
            sb.append(sa);
        }
        return sb.toString();
    }
}
