package Leetcode;
import java.util.*;

public class Word_pattern_290 {
    public static void main(String[] args) {
        Boolean result=Word_pattern_290.wordPattern("abba","dog cat cat dog");
        System.out.println(result);
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> cw=new HashMap<>();
        HashMap<String,Character> wc=new HashMap<>();
        String[] words=s.split(" ");
        if(words.length!=pattern.length())
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String word=words[i];
            if(!cw.containsKey(c))
            {
                cw.put(c,word);
            }
            if(!wc.containsKey(word))
            {
                wc.put(word,c);
            }
            if(!cw.get(c).equals(word) || !wc.get(word).equals(c))
            {
                return false;
            }
        }
        return true;
    }
}
