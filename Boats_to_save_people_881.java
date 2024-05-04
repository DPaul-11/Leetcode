package Leetcode;
import java.util.*;
public class Boats_to_save_people_881 {
    public static void main(String[] args) {
        int[] people={3,5,3,4};
        int limit=5;
        Boats_to_save_people_881 ob=new Boats_to_save_people_881();
        System.out.println(ob.numRescueBoats(people, limit));
    }
    public int numRescueBoats(int[] people, int limit)
    {
        int count=0;
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        while(left<=right)
        {
            if(people[left]+people[right]<=limit)
            {
                left++;
            }
            right--;
            count++;
        }
        return count;
    }
}
