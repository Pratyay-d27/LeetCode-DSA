class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int present = 0, time = 0;
        for(int toFloor: requests)
            {
                if(present == toFloor)
                    time = time;
                else if(present != toFloor)
                {
                    time += Math.abs(present - toFloor);
                    present = toFloor;
                }
            }
        return time;
    }
}
