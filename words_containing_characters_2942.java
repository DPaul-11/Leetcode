package Leetcode;
import java.util.*;
public class words_containing_characters_2942 {
    public static void main(String[] args) {
        String[] words = {"Leet", "code"};
        char x = 'e';
        words_containing_characters_2942 ob = new words_containing_characters_2942();
        System.out.println(ob.findWordsContaining(words, x));
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
