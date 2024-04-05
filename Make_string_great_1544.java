package Leetcode;

public class Make_string_great_1544 {
    public static void main(String[] args) {
        String s="LeEeetcode";
        Make_string_great_1544 ob=new Make_string_great_1544();
        System.out.println(ob.makeGood(s));
    }
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(sb.length()>0 && isBadPair(sb.charAt(sb.length()-1), c))
            {
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    private boolean isBadPair(char a, char b)
    {
        return a!=b && Character.toLowerCase(a)==Character.toLowerCase(b);
    }
}
