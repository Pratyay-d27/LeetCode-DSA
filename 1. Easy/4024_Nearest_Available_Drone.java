class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<drones.length; i++)
        {
            int di = drones[i][0], dj = drones[i][1], range = drones[i][2];
            int dist = Math.abs(target[0] - di) + Math.abs(target[1] - dj);
            if(dist <= range)
            {
                if(dist < min)
                {
                    min = dist;
                    index = i;
                }
            }
        }
        return index;
    }
}
