package Leetcode;

public class First_index_of_first_occurence_in_string {
    public static void main(String[] args) {
        String haystack="sadnotsad";
        String needle="sad";
        First_index_of_first_occurence_in_string ob=new First_index_of_first_occurence_in_string();
        System.out.println(ob.strStr(haystack, needle));
    }
    public int strStr(String haystack, String needle) {
        int index=0;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(index))
            {
                index++;
            }else{
                i=i-index;
                index=0;
            }
            if(index==needle.length())
            {
                return i-needle.length()+1;
            }
        }
        return -1;
    }
}
