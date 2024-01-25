package Leetcode;

public class H_index_274 {
    public static void main(String[] args) {
        int[] citations={3,0,6,1,5};
        H_index_274 ob=new H_index_274();
        System.out.println(ob.hIndex(citations));
    }
    public int hIndex(int[] citations) {
        int l=citations.length;
        int[] arr=new int[l+1];
        for(int c:citations)
        {
            if(c>l)
            {
                arr[l]++;
            }else{
                arr[c]++;
            }
        }
        int count=0;
        for(int i=l;i>=0;i--)
        {
            count=count+arr[i];
            if(count>=i)
            {
                return i;
            }
        }
        return 0;
    }
}
