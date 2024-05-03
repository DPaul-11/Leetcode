package Leetcode;

public class Compare_version_numbers_165 {
    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";
        Compare_version_numbers_165 ob=new Compare_version_numbers_165();
        System.out.println(ob.compareVersion(version1, version2));
    }
    public int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;
        while(i<version1.length() || j<version2.length())
        {
            int v1=0;
            int v2=0;
            while(i<version1.length() && version1.charAt(i)!='.')
            {
                v1=v1*10+(version1.charAt(i)-'0');
                i++;
            }
            while(j<version2.length() && version2.charAt(j)!='.')
            {
                v2=v2*10+(version2.charAt(j)-'0');
                j++;
            }
            if(v1>v2)
            {
                return 1;
            }else if(v1<v2){
                return -1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
