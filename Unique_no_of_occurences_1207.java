package Leetcode;
import java.util.*;

public class Unique_no_of_occurences_1207 {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,1};
        Unique_no_of_occurences_1207 ob=new Unique_no_of_occurences_1207();
        System.out.println(ob.uniqueOccurrences(arr));
    }
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if( set.contains(entry.getValue()) )
                return false;
            else
                set.add(entry.getValue());
        }
        return true;

    }
}
