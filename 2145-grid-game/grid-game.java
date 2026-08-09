class Solution {
    public long gridGame(int[][] grid) {
        int n=grid[0].length;
        long top=0;
        for(int j=0;j<n;j++)
        {
            top+=grid[0][j];
        }
        long bottom=0;
        long answer=Long.MAX_VALUE;
        for(int j=0;j<n;j++)
        {
            top-=grid[0][j];
            long secondRobot=Math.max(top,bottom);
            answer=Math.min(answer,secondRobot);
            bottom+=grid[1][j];
        }
        return answer;

    }
    
}