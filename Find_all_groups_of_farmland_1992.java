package Leetcode;
import java.util.*;

public class Find_all_groups_of_farmland_1992 {
    public static void main(String[] args) {
        int[][] land={{1,0,0},{0,1,1},{0,1,1}};
        Find_all_groups_of_farmland_1992 ob=new Find_all_groups_of_farmland_1992();
        System.out.println(Arrays.deepToString(ob.findFarmland(land)));
    }
    public int[][] findFarmland(int[][] land) {
        List<int[]> res=new ArrayList<>();
        int m=land.length;
        int n=land[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(land[i][j]==1)
                {
                    int[] coordinates=farmLandCoordinates(land, i, j);
                    res.add(coordinates);
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    public int[] farmLandCoordinates(int[][] land, int row, int col)
    {
        int[] coordinates=new int[4];
        coordinates[0]=row;
        coordinates[1]=col;
        int m=land.length;
        int n=land[0].length;
        int r=row;
        int c=col;
        while(r<m && land[r][col]==1)
        {
            r++;
        }
        while(c<n && land[row][c]==1)
        {
            c++;
        }
        coordinates[2]=r-1;
        coordinates[3]=c-1;
        for(int i=row;i<r;i++)
        {
            for(int j=col;j<c;j++)
            {
                land[i][j]=0;
            }
        }
        return coordinates;
    }
}
