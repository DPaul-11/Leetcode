package Leetcode;

public class First_palindromic_string_in_array_2108 {
    public static void main(String[] args) {
        String words[]={"abc","car","ada","racecar","cool"};
        First_palindromic_string_in_array_2108 ob=new First_palindromic_string_in_array_2108();
        System.out.println(ob.firstPalindrome(words));
    }
    public String firstPalindrome(String[] words) {
        for(String str: words)
        {
            int left=0;
            int right=str.length()-1;
            boolean flag=true;
            while(left<right)
            {
                if(str.charAt(left)!=str.charAt(right))
                {
                    flag=false;
                }
                left++;
                right--;
            }
            if(flag)
            {
                return str;
            }
        }
        return "";
    }
}
