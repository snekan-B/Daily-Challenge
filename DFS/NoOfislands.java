class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && visited[i][j]==false)
                {
                    count=count+dfs(grid,visited,i,j);
                }
            }
        }
        return count;
    }

    public static int dfs(char [][] grid,boolean [][] visited,int r,int c)
    {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || visited[r][c]==true || grid[r][c]=='0')
        return 0;

        visited[r][c]=true;

        dfs(grid,visited,r+1,c);
        dfs(grid,visited,r-1,c);
        dfs(grid,visited,r,c+1);
        dfs(grid,visited,r,c-1);

        return 1;
    }
}