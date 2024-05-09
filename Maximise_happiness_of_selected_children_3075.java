package Leetcode;
import java.util.*;

public class Maximise_happiness_of_selected_children_3075 {
    public static void main(String[] args) {
        int[] happiness={1,2,3};
        int k=2;
        Maximise_happiness_of_selected_children_3075 ob=new Maximise_happiness_of_selected_children_3075();
        System.out.println(ob.maximumHappinessSum(happiness, k));
    }
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
        int dec=0;
        int value=0;
        long res=0;
        for(int i=n-1;i>=n-k;i--)
        {
            value=happiness[i]-dec;
            dec++;
            if(value>0)
            {
                res+=value;
            }
        }
        return res;
    }
}
