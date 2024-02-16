package Leetcode;
import java.util.*;

public class Least_Number_of_Unique_Integers_after_K_Removals_1481 {
    public static void main(String[] args) {
        int arr[]={5,5,4};
        int k=1;
        Least_Number_of_Unique_Integers_after_K_Removals_1481 ob=new Least_Number_of_Unique_Integers_after_K_Removals_1481();
        System.out.println(ob.findLeastNumOfUniqueInts(arr,k));
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i: arr)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Integer> v=new ArrayList<>();
        int count=0;
        for(int i: map.values())
        {
            v.add(i);
        }
        Collections.sort(v);
        for(int i=0;i<v.size();i++)
        {
            if(k>v.get(i))
            {
                k-=v.get(i);
                v.set(i,0);
            }else{
                v.set(i, v.get(i)-k);
                k=0;
            }
            if(v.get(i)!=0)
            {
                count++;
            }
        }
        return count;
    }
}
