package Leetcode;

public class No_of_students_unable_to_eat_lunch_1700 {
    public static void main(String[] args) {
        int students[] = {1,1,0,0};
        int sandwiches[] = {0,1,0,1};
        No_of_students_unable_to_eat_lunch_1700 ob=new No_of_students_unable_to_eat_lunch_1700();
        System.out.println(ob.countStudents(students, sandwiches));
    }
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count=new int[2];
        for(int student: students)
        {
            count[student]++;
        }
        int remaining=sandwiches.length;
        for(int sandwich: sandwiches)
        {
            if(count[sandwich]==0)
            {
                break;
            }
            if(remaining--==0)
            {
                break;
            }
            count[sandwich]--;
        }
        return remaining;
    }
}
