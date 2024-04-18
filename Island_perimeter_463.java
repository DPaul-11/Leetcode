package Leetcode;

public class Island_perimeter_463 {
    public static void main(String[] args) {
        int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        Island_perimeter_463 ob=new Island_perimeter_463();
        System.out.println(ob.islandPerimeter(grid));
    }
    public int islandPerimeter(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    if((j>0 && grid[i][j-1]==0) || j==0)
                    {
                        count++;
                    }
                    if((i>0 && grid[i-1][j]==0) || i==0)
                    {
                        count++;
                    }
                    if((j<col-1 && grid[i][j+1]==0) || j==col-1)
                    {
                        count++;
                    }
                    if((i<row-1 && grid[i+1][j]==0) || i==row-1)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
