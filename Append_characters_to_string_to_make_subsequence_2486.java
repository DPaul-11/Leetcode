package Leetcode;

public class Append_characters_to_string_to_make_subsequence_2486 {
    public static void main(String[] args) {
        String s="coaching";
        String t="coding";
        Append_characters_to_string_to_make_subsequence_2486 ob=new Append_characters_to_string_to_make_subsequence_2486();
        System.out.println(ob.appendCharacters(s, t));
    }
    public int appendCharacters(String s, String t) {
        int m=s.length();
        int n=t.length();
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                j++;
            }
            i++;
        }
        return n-j;
    }
}
