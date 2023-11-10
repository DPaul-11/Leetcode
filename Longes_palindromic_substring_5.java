package Leetcode;
import java.util.*;

public class Longes_palindromic_substring_5 {

    public static void main(String[] args) {
        String s="abacd";
        Longes_palindromic_substring_5 ob=new Longes_palindromic_substring_5();
        System.out.println(ob.longestPalindrome(s));
    }
    public String longestPalindrome(String s) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        int max=0;
        String sb="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int beg=j;
                int end=i;
                int count=0;
                while(beg<=end)
                {
                    if(ch[beg]!=ch[end])
                    {
                        count=0;
                        break;
                    }
                    else if(beg<end)
                    {
                        beg++;
                        end--;
                        count=count+2;
                    }
                    else if(beg==end)
                    {
                        beg++;
                        end--;
                        count=count+1;
                    }
                }
                if(count>max)
                {
                    max=count;
                    sb=s.substring(j,i+1);
                }
            }
        }
        return sb;
    }
}
