package Leetcode;

public class Number_of_islands_200 {
    public static void main(String[] args) {
        char[][] grid={{'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}};
        Number_of_islands_200 ob=new Number_of_islands_200();
        System.out.println(ob.numIslands(grid));
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }
    public void bfs(char[][] grid, int i, int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        bfs(grid, i+1, j);
        bfs(grid, i-1, j);
        bfs(grid, i, j+1);
        bfs(grid, i, j-1);
    }
}
