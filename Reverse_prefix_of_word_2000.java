package Leetcode;

public class Reverse_prefix_of_word_2000 {
    public static void main(String[] args) {
        String word="abcdefgh";
        char ch='d';
        Reverse_prefix_of_word_2000 ob=new Reverse_prefix_of_word_2000();
        System.out.println(ob.reversePrefix(word,ch));
    }
    public String reversePrefix(String word, char ch) {
        int index=0;
        for(int i=0;i<word.length();i++)
        {

            if(word.charAt(i)==ch)
            {
                index=i;
                break;
            }
        }
        return reverse(word,index);
    }
    public String reverse(String s,int k)
    {
        char[] c=s.toCharArray();
        for(int i=0,j=k;i<(k+1)/2;i++,j--)
        {
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
        }
        return new String(c);
    }
}
