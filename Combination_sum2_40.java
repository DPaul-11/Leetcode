package Leetcode;
import java.util.*;
public class Combination_sum2_40 {
    public static void main(String[] args) {
        int candidates[]={10,1,2,7,6,1,5};
        int target=8;
        Combination_sum2_40 ob=new Combination_sum2_40();
        System.out.println(ob.combinationSum2(candidates,target));

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> a = new ArrayList<>();
        result = new ArrayList<>();
        helper(candidates,0,a,target);
        return result;
    }
    static List<List<Integer>> result;
    static void helper(int candidates[], int idx, List<Integer> a, int target){
        if(target==0){
            System.out.println(a);
            result.add(new ArrayList<>(a));
            return;
        }
        if(idx==candidates.length) return;

        if(candidates[idx]<=target){
            a.add(candidates[idx]);
            helper(candidates,idx+1,a,target-candidates[idx]);
            a.remove(a.size()-1);
        }
        int j = idx+1;
        while(j<candidates.length && candidates[j]==candidates[j-1]) j++;
        helper(candidates,j,a,target);
    }
}
