class search {
 
    private static void search(int[][] mat, int n, int x)
    {
 
        int i = 0, j = n - 1;
 
        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("Element found at " + i
                                 + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else
                i++;
        }
 
        System.out.print("n Element not found");
        return;
    }
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
 
        search(mat, 4, 29);
    }
}
