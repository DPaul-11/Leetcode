package Leetcode;
import java.util.*;

public class Custom_sort_string_791 {
    public static void main(String[] args) {
        String order="cba";
        String s="abcd";
        Custom_sort_string_791 ob=new Custom_sort_string_791();
        System.out.println(ob.customSortString(order, s));
    }
    public String customSortString(String order, String s) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (mp.containsKey(c)) {
                result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
                mp.remove(c);
            }
        }
        for (char c : mp.keySet()) {
            result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
        }
        return result.toString();
    }
}
