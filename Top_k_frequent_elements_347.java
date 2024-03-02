package Leetcode;
import java.util.*;
public class Top_k_frequent_elements_347 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        Top_k_frequent_elements_347 ob=new Top_k_frequent_elements_347();
        System.out.println(Arrays.toString(ob.topKFrequent(nums, k)));
    }
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new List[nums.length+1];
        HashMap<Integer, Integer> frequencyMap=new HashMap<>();
        for(int n: nums)
        {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0)+1);
        }
        for(int key: frequencyMap.keySet())
        {
            int frequency=frequencyMap.get(key);
            if(bucket[frequency]==null)
            {
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result=new int[k];
        int count=0;
        for(int pos=bucket.length-1;pos>=0 && count<k;pos--)
        {
            if(bucket[pos]!=null)
            {
                for(int i: bucket[pos])
                {
                    result[count++]=i;
                }
            }
        }
        return result;
    }
}
