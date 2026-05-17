/*
LeetCode Link: https://leetcode.com/problems/jump-game-iii/?envType=daily-question&envId=2026-05-17
*/

class Solution {
    static boolean check;
    public boolean canReach(int[] arr, int start) {
        boolean visited[] = new boolean[50001];
        check = false;
        solve(start, arr, visited);
        return check;
    }
    static void solve(int index, int [] arr, boolean[] visited)
    {
        if(index >= arr.length || index < 0)
        return;
        if(index < arr.length && index >= 0 && arr[index] == 0)
        {
            check = true;
            return;
        }

        if(visited[index] == true)
        return;
        visited[index] = true;
        
        solve(index - arr[index], arr, visited);
        solve(index + arr[index], arr, visited);
    }
}
