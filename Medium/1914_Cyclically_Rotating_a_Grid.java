/*
LeetCode Link: https://leetcode.com/problems/cyclically-rotating-a-grid/?envType=daily-question&envId=2026-05-09
*/

class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int r = grid.length, c = grid[0].length;
        int left = 0, right = c - 1, top = 0, bottom = r - 1, count = 0;
        while (count < (r * c)) {
            int keep = count;
            ArrayList <Integer> li = new ArrayList<>();
            for (int j = left; j <= right && count < (r * c); j++) {
                li.add(grid[top][j]);
                count++;
            }
            top++;
            for (int i = top; i <= bottom && count < (r * c); i++) {
                li.add(grid[i][right]);
                count++;
            }
            right--;

            for (int j = right; j >= left && count < (r * c); j--) {
                li.add(grid[bottom][j]);
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top && count < (r * c); i--) {
                li.add(grid[i][left]);
                count++;
            }
            left++;

            //1 round over 
            ArrayList<Integer> list = rotate(li, k);
            top--;
            right++;
            bottom++;
            left--;
            count = keep;
            int index = 0;

            //assign all the values from list to grid
            for (int j = left; j <= right && count < (r * c); j++) {
                grid[top][j] = list.get(index);
                index+=1;
                count++;
            }
            top++;
            for (int i = top; i <= bottom && count < (r * c); i++) {
                grid[i][right] = list.get(index);;
                index+=1;
                count++;
            }
            right--;

            for (int j = right; j >= left && count < (r * c); j--) {
                grid[bottom][j] = list.get(index);;
                index+=1;
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top && count < (r * c); i--) {
                grid[i][left] = list.get(index);;
                index+=1;
                count++;
            }
            left++;
        }
        return grid;
    }
    static ArrayList<Integer> rotate(ArrayList<Integer> list, int k)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        k = k % list.size();
        if(k == 0)
        return list;
        int n = list.size();
        for(int i = k; i<n; i++)
        list1.add(list.get(i));
        for(int i = 0; i<k; i++)
        list1.add(list.get(i));
        return list1;
    }
    static void print(int matrix[][])
    {
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
