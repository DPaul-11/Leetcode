package Leetcode;
import java.util.*;

public class Hand_of_straights_846 {
    public static void main(String[] args) {
        int hand[]={1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        Hand_of_straights_846 ob=new Hand_of_straights_846();
        System.out.println(ob.isNStraightHand(hand, groupSize));
    }
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize !=0)
        {
            return false;
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int cards: hand)
        {
            map.put(cards, map.getOrDefault(cards, 0)+1);
        }
        int[] arr=new int[map.size()];
        int index=0;
        for(int key: map.keySet())
        {
            arr[index++]=key;
        }
        Arrays.sort(arr);
        for(int key: arr)
        {
            if(map.get(key)>0)
            {
                int start=map.get(key);
                for(int i=key;i<key+groupSize;i++)
                {
                    if(map.getOrDefault(i, 0)<start)
                    {
                        return false;
                    }
                    map.put(i, map.get(i)-start);
                }
            }
        }
        return true;
    }
}
