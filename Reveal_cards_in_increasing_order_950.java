package Leetcode;
import java.util.*;

public class Reveal_cards_in_increasing_order_950 {
    public static void main(String[] args) {
        int deck[]={17,13,11,2,3,5,7};
        Reveal_cards_in_increasing_order_950 ob=new Reveal_cards_in_increasing_order_950();
        System.out.println(Arrays.toString(ob.deckRevealedIncreasing(deck)));
    }
    public int[] deckRevealedIncreasing(int[] deck) {
        LinkedList<Integer> queue=new LinkedList();
        Arrays.sort(deck);
        int[] ans=new int[deck.length];
        for(int i=0;i<deck.length;i++)
        {
            queue.offer(i);
        }
        for(int i=0;i<deck.length;i++)
        {
            ans[queue.poll()]=deck[i];
            queue.offer(queue.poll());
        }
        return ans;
    }
}
