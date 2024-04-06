package Leetcode;

public class Unique_paths_62 {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        Unique_paths_62 ob=new Unique_paths_62();
        System.out.println(ob.uniquePaths(m, n));
    }
    public int uniquePaths(int m, int n) {
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0)
                {
                    grid[i][j]=1;
                }else{
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
            }
        }
        return grid[m-1][n-1];
    }
}
