package Leetcode;
import java.util.*;
import java.util.HashMap;

public class Groupanagram {
    public static void main(String[] args) {
    String[] strs={"eat","ate","tan","nat","tea","bat"};
    Groupanagram ob=new Groupanagram();
    System.out.println(ob.groupAnagrams(strs));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s: strs)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sa=String.valueOf(c);
            List<String> list=new ArrayList<>();
            if(!map.containsKey(sa))
            {
                map.put(sa, list);
            }

            map.get(sa).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
