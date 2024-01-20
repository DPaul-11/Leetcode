import java.util.*;

public class Trustt {
    public static void main(String[] args) {
        int[] arr={6,1,4,10,2,5};
        int j;
        System.out.print("_,");
        for(int i=1;i<arr.length;i++)
        {
            for(j=i-1;j>=0;j--)
            {
                if(arr[j]<arr[i]) {
                    System.out.print(arr[j] + ",");
                    break;
                }
            }
            if(j==-1)
            {
                System.out.print("_,");
            }
        }
    }
}
