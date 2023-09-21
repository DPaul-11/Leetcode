//package Leetcode;
//import java.util.*;
//import java.util.HashMap;
//
//public class Kdiff {
//    public static void main(String[] args) {
//        int[] nums={3,1,4,1,5};
//        int k=2;
//        Kdiff ob=new Kdiff();
//        System.out.println(ob.findPairs(nums,k));
//    }
//    public int findPairs(int[] nums, int k) {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int n:nums)
//        {
//            map.put(n,map.getOrDefault(n,0)+1);
//        }
//        int result=0;
//        for(int x:map.keySet())
//        {
//            if(k>0 && map.containsKey(x+k) || k==0 && map.get(x)>1)
//            {
//                result++;
//            }
//        }
//        return result;
//    }
//}
