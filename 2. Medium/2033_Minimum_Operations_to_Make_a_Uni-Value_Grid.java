/*
LeetCode Link: https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/?envType=daily-question&envId=2026-04-28
*/

class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<grid.length; i++)
        {
            for(int j = 0; j<grid[i].length; j++)
            {
                list.add(grid[i][j]);
            }
        }
        //sort the list
        Collections.sort(list);
        //the middlemost/2 middlemost elements will be used 
        int count1 = 0, count2 = 0;
        //when list size is even = select 2 middlemost elements
        if(list.size() % 2 == 0)//even
        {
            int mid1 = list.get((list.size()/2) - 1);
            int mid2 = list.get(list.size()/2);
            for(int i = 0; i<list.size(); i++)
            {
                int key = list.get(i);
                int d1 = Math.abs(key - mid1);
                if(d1 % x != 0)
                return -1;
                count1 += d1/x;
                int d2 = Math.abs(key - mid2);
                if(d2 % x != 0)
                return -1;
                count2 += d2/x;
            }
            count1 = Math.min(count1, count2);//final valiue stored here
            return count1;
        }
        //when odd
        else
        {
            count2 = 0;
            int mid = list.get(list.size()/2);
            for(int i = 0; i<list.size(); i++)
            {
                int key = list.get(i);
                int d = Math.abs(key - mid);
                if(d % x != 0)
                return -1;
                count2 += d/x;
            }
            return count2;
        }
    }
}
