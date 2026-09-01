// Greedy solution 

class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>(); //declaring Hash Map for frequency count
        for(int ele: tasks)
        {
            if(map.containsKey(ele) == false)
            map.put(ele, 1);
            else 
            map.put(ele, map.get(ele)+1);
        }

        int rounds = 0;
        for(var ele: map.entrySet()) // traversing the map
        {
            int value = ele.getValue();

            //base case 
            if(value == 1)
            return -1;

            int two = Integer.MAX_VALUE, three = Integer.MAX_VALUE;
            if(value % 3 == 0)
            three = value / 3;
            
            
            if(value % 2 == 0)
            two = value / 2;

            int d1 = Integer.MAX_VALUE, d2 = Integer.MAX_VALUE;
            if((value-3) % 2 == 0)
            d1 = value / 2 + 1;

            int val1 = value-2, val2 = value - 4;
            if(val1 % 3 == 0)
            d2 = val1 / 3 + 1;
            else 
            d2 = val2 / 3 + 2;
            
            int k1 = Math.min(two, three);
            int k2 = Math.min(d1, d2);
            rounds += Math.min(k1, k2);
        }
        return rounds;
    }
}
