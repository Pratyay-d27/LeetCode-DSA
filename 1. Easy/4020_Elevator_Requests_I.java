class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int present = 0, time = 0;
        for(int toFloor: requests)
            {
                if(present == toFloor) //if present floor same as the intended floor to go
                    time = time;
                else if(present != toFloor) //if present floor not same as the intended floor to go
                {
                    time += Math.abs(present - toFloor);
                    present = toFloor;
                }
            }
        return time; //return total required time 
    }
}
