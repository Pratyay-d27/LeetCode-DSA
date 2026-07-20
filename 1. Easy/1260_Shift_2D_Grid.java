class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int arr[] = new int[m*n];
        int count = 0;
        for(int i = 0; i<grid.length; i++)
        {
            for(int j = 0; j<grid[0].length; j++)
            {
                arr[count++] = grid[i][j];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        n = arr.length;
        k = k % n;
        for(int i = n-k; i<n; i++)
        list.add(arr[i]);
        for(int i = 0; i<n-k; i++)
        list.add(arr[i]);

        count = 0;
        List<List<Integer>> anslist = new ArrayList<>();
        for(int i = 0; i<grid.length; i++)
        {
            List<Integer> ans = new ArrayList<>();
            for(int j = 0; j<grid[i].length; j++)
            {
                ans.add(list.get(count++));
            }
            anslist.add(ans);
        }
        return anslist;
    }
}
