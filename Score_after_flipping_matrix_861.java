package Leetcode;

public class Score_after_flipping_matrix_861 {
    public static void main(String[] args) {
        int[][] grid={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        Score_after_flipping_matrix_861 ob=new Score_after_flipping_matrix_861();
        System.out.println(ob.matrixScore(grid));
    }
    public int matrixScore(int[][] grid) {
        int score=0;
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][0]==0)
            {
                for(int j=0;j<grid[0].length;j++)
                {
                    grid[i][j]=1-grid[i][j];
                }
            }
        }
        for(int i=1;i<grid[0].length;i++)
        {
            int count=0;
            for(int j=0;j<grid.length;j++)
            {
                if(grid[j][i]==1)
                {
                    count++;
                }
            }
            if(count*2 < grid.length)
            {
                for(int j=0;j<grid.length;j++)
                {
                    grid[j][i]=1-grid[j][i];
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            int row=0;
            for(int j=0;j<grid[0].length;j++)
            {
                row=row*2 + grid[i][j];
            }
            score+=row;
        }
        return score;
    }
}
