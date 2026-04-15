/*
LeetCode Link: https://leetcode.com/problems/minimum-total-distance-traveled/?envType=daily-question&envId=2026-04-14
*/
class Solution {
    static long solve(int robot, int factory, List<Integer>robots, ArrayList<Integer>factories, long array[][])
    {
        //base cases
        if(robot >= robots.size())
        return 0;
        if(factory >= factories.size())
        return (long)Math.pow(10, 12);

        //memoize code 
        if(array[robot][factory] != -1)
        return array[robot][factory];

        //rest of the code(recursion code)
        long take = Math.abs(robots.get(robot) - factories.get(factory)) + solve(robot+1, factory+1, robots, factories, array);
        long skip = solve(robot, factory+1, robots, factories, array);

        return array[robot][factory] = Math.min(take, skip);
    }

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> Integer.compare(a[0], b[0]));
        //shift all elements of factory arry to an arraylist
        ArrayList<Integer>positions = new ArrayList<>();
        for(int i = 0; i<factory.length; i++)
        {
            int pos = factory[i][0];
            int limit = factory[i][1];
            for(int j = 0; j<limit; j++)
            {
                positions.add(pos);
            }
        }
        //declare 2d array for memoization
        int m = robot.size();
        int n = positions.size();
        long array[][] = new long[m][n];
        //fill all the places of the 2d memoization array with -1
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                array[i][j] = -1;
            }
        }
        //call to solve function
        return solve(0, 0, robot, positions, array);
    }
}
