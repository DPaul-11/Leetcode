package Leetcode;
import java.util.*;

public class Find_winner_of_circular_game_1823 {
    public static void main(String[] args) {
        int n=5;
        int k=2;
        Find_winner_of_circular_game_1823 ob=new Find_winner_of_circular_game_1823();
        System.out.println(ob.findTheWinner(n, k));
    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            circle.add(i);
        }
        int pos=0;
        while(n>1)
        {
            pos=(pos+(k-1))%n;
            circle.remove(pos);
            n--;
        }
        return circle.get(0);
    }
}
