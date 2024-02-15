package Leetcode;
import java.util.*;
import java.util.Stack;

public class Simplify_path_71 {
    public static void main(String[] args) {
        String path="/home/";
        Simplify_path_71 ob=new Simplify_path_71();
        System.out.println(ob.simplifyPath(path));
    }
    public String simplifyPath(String path) {
        Stack<String> stk=new Stack<>();
        String[] vals=path.split("/");
        for(String val: vals)
        {
            if(val.equals("..") && !stk.isEmpty())
            {
                stk.pop();
            }else if(!val.equals(".") && !val.equals("..") && !val.equals(""))
            {
                stk.push(val);
            }
        }
        return "/"+String.join("/",stk);
    }
}
