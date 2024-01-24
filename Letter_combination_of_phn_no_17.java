package Leetcode;
import java.util.*;
public class Letter_combination_of_phn_no_17 {
    public static void main(String[] args) {
        String digits="23";
        Letter_combination_of_phn_no_17 ob=new Letter_combination_of_phn_no_17();
        System.out.println(ob.letterCombinations(digits));
    }
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0)
        {
            return result;
        }
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        backtrack(digits,0,map, new StringBuilder(),result);
        return result;
    }
    public static void backtrack(String digits, int i, HashMap<Character,String> map, StringBuilder sb, List<String> result)
    {
        if(i==digits.length())
        {
            result.add(sb.toString());
            return;
        }
        String current=map.get(digits.charAt(i));
        for(int k=0;k<current.length();k++)
        {
            sb.append(current.charAt(k));
            backtrack(digits,i+1,map,sb,result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
