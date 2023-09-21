package Leetcode;

public class Anagram {
    public static void main(String[] args) {
        Boolean result=Anagram.isAnagram("cat","bat");
        System.out.println(result);
    }
        public static boolean isAnagram(String s, String t) {
            int l=s.length();
            int m=t.length();
            if(l!=m)
            {
                return false;
            }
            int[] arr=new int[26];
            for(int i=0;i<l;i++)
            {
                arr[s.charAt(i)-'a']++;
            }
            for(int i=0;i<m;i++)
            {
                arr[t.charAt(i)-'a']--;
                if(arr[t.charAt(i)-'a']<0)
                {
                    return false;
                }
            }
            return true;
        }
}
