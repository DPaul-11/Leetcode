package Leetcode;
import java.util.*;
import java.util.HashMap;

public class Isomorphix_string_205 {
    public static void main(String[] args) {
        String s = "badc", t = "kikp";
        Isomorphix_string_205 ob=new Isomorphix_string_205();
        System.out.println(ob.isIsomorphic(s,t));
    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        if(s.equals(t))
        {
            return true;
        }
        HashMap<Character, Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char original=s.charAt(i);
            char replace=t.charAt(i);
            if(!map.containsKey(original))
            {
                if(!map.containsValue(replace))
                {
                    map.put(original,replace);
                }
                else{
                    return false;
                }
            }else{
                char mappedchar=map.get(original);
                if(mappedchar!=replace)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
