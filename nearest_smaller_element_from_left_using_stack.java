package Leetcode;
import java.util.*;
public class nearest_smaller_element_from_left_using_stack {
    public static void main(String[] args) {
        int[] arr={6,1,4,10,2,5};
        printprevsmaller(arr);
    }
    static void printprevsmaller(int[] arr)
    {
        Stack<Integer> S=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!S.empty() && S.peek()>=arr[i])
            {
                S.pop();
            }
            if(S.empty())
            {
                System.out.print("_,");
            }
            else{
                System.out.print(S.peek()+",");
            }
            S.push(arr[i]);
        }
    }
}
