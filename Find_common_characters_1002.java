package Leetcode;
import java.util.*;

public class Find_common_characters_1002 {
    public static void main(String[] args) {
        String words[]={"bella","label","roller"};
        Find_common_characters_1002 ob=new Find_common_characters_1002();
        System.out.println(Arrays.deepToString(new List[]{ob.commonChars(words)}));
    }
    public List<String> commonChars(String[] words) {
        List<String> res=new ArrayList<>();
        int[] freq=new int[26];
        Arrays.fill(freq, Integer.MAX_VALUE);
        for(String word: words)
        {
            int[] arr=new int[26];
            for(char c: word.toCharArray())
            {
                arr[c-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                freq[i]=Math.min(freq[i], arr[i]);
            }
        }
        for(int i=0;i<26;i++)
        {
            while(freq[i]>0)
            {
                char x=(char)(i+'a');
                res.add(Character.toString(x));
                freq[i]--;
            }
        }
        return res;
    }
}
