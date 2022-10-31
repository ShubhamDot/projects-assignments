class Solution 
{
    public boolean isToeplitzMatrix(int[][] m) 
    {
        for (int i = 1; i < m.length; i++)
            for (int j = 0; j < m[0].length-1; j++)
                if (m[i-1][j] != m[i][j+1]) return false;
        return true;   
    }
}
