package Leetcode;
import java.util.*;
public class Defanging_IP_address_1108 {
    public static void main(String[] args) {
        String address="1.1.1.1";
        Defanging_IP_address_1108 ob=new Defanging_IP_address_1108();
        System.out.println(ob.defangIPaddr(address));
    }
    public String defangIPaddr(String address) {
        String answer="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                answer=answer+"[.]";
            }else{
                answer=answer+address.charAt(i);
            }
        }
        return answer;
    }
}
