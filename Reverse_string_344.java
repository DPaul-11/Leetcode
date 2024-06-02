package Leetcode;

public class Reverse_string_344 {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        Reverse_string_344 ob=new Reverse_string_344();
        System.out.println(ob.reverseString(s));
    }
    public boolean reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end)
        {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        return false;
    }
}
