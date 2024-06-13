package Leetcode;
import java.util.*;

public class Min_num_moves_to_seat_everyone_2037 {
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        Min_num_moves_to_seat_everyone_2037 ob=new Min_num_moves_to_seat_everyone_2037();
        System.out.println(ob.minMovesToSeat(seats, students));
    }
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves=0;
        for(int i=0;i<seats.length;i++)
        {
            moves+=Math.abs(seats[i]-students[i]);
        }
        return moves;
    }
}
