//package Leetcode;
//import java.util.*;
//public class Set_matrix_zeroes_74 {
//    public static void main(String[] args) {
//        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
//        Set_matrix_zeroes_74 ob =new Set_matrix_zeroes_74();
//        boolean res=ob.setZeroes(matrix);
//    }
//    public void setZeroes(int[][] matrix) {
//        boolean firstrow=false;
//        boolean firstcol=false;
//        for(int i=0;i< matrix.length;i++)
//        {
//            for(int j=0;j<matrix[0].length;j++)
//            {
//                if(matrix[i][j]==0)
//                {
//                    if(i==0)
//                    {
//                        firstrow=true;
//                    }
//                    if(j==0)
//                    {
//                        firstcol=true;
//                    }
//                    matrix[0][j]=0;
//                    matrix[i][0]=0;
//                }
//            }
//        }
//        for(int i=1;i< matrix.length;i++)
//        {
//            for(int j=1;j<matrix[0].length;j++)
//            {
//                if(matrix[i][0]==0 || matrix[0][j]==0)
//                {
//                    matrix[i][j]=0;
//                }
//            }
//        }
//        if(firstrow)
//        {
//            for(int j=0;j<matrix[0].length;j++)
//            {
//                matrix[0][j]=0;
//            }
//        }
//        if(firstcol)
//        {
//            for(int i=0;i<matrix.length;i++)
//            {
//                matrix[i][0]=0;
//            }
//        }
//    }
//}
