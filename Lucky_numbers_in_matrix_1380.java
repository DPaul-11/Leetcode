package Leetcode;
import java.util.*;

public class Lucky_numbers_in_matrix_1380 {
    public static void main(String[] args) {
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        Lucky_numbers_in_matrix_1380 ob=new Lucky_numbers_in_matrix_1380();
        System.out.println(ob.luckyNumbers(matrix));
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        List<Integer> rowRes=new ArrayList<>();
        List<Integer> colRes=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            int rowMin=Integer.MAX_VALUE;
            for(int j=0;j<col;j++)
            {
                rowMin=Math.min(rowMin, matrix[i][j]);
            }
            rowRes.add(rowMin);
        }
        for(int i=0;i<col;i++)
        {
            int colMax=Integer.MIN_VALUE;
            for(int j=0;j<row;j++)
            {
                colMax=Math.max(colMax, matrix[j][i]);
            }
            colRes.add(colMax);
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==rowRes.get(i) && matrix[i][j]==colRes.get(j))
                {
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    }
}
