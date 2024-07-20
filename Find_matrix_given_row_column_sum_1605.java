package Leetcode;

import java.util.Arrays;

public class Find_matrix_given_row_column_sum_1605 {
    public static void main(String[] args) {
        int[] rowSum = {3,8};
        int[] colSum = {4,7};
        Find_matrix_given_row_column_sum_1605 ob=new Find_matrix_given_row_column_sum_1605();
        System.out.println(Arrays.deepToString(ob.restoreMatrix(rowSum, colSum)));
    }
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int numRows=rowSum.length;
        int colRows=colSum.length;
        int[][] res=new int[numRows][colRows];
        int i=0;
        int j=0;
        while(i<numRows && j<colRows)
        {
            int val=Math.min(rowSum[i],colSum[j]);
            res[i][j]=val;
            rowSum[i]-=val;
            colSum[j]-=val;
            if(rowSum[i]==0)
            {
                i++;
            }
            if(colSum[j]==0)
            {
                j++;
            }
        }
        return res;
    }
}
