class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, ArrayList<Integer>>map = new HashMap<>();
        for(int i = 0; i<reservedSeats.length; i++)
        {
            if(map.containsKey(reservedSeats[i][0]) == false)
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(reservedSeats[i][1]);
                map.put(reservedSeats[i][0], list);
            }
            else 
            {
                ArrayList<Integer> list = map.get(reservedSeats[i][0]);
                list.add(reservedSeats[i][1]);
                map.put(reservedSeats[i][0], list);
            }
        }
        int count = 0;
        for(var ele: map.entrySet())
        {

            int i = ele.getKey();
            ArrayList<Integer> list = map.get(i);
            if(list.size() >= 7)
            continue;

            int max = 0;

            if((list.contains(2) || list.contains(3) || list.contains(4) || list.contains(5)) == false )
            {
                count++;
                max = 1;
            }

            if((list.contains(6) || list.contains(7) || list.contains(8) || list.contains(9)) == false )
            {
                count++;
                max = 13;
            }

            if(max == 0)
            {
                if((list.contains(4) || list.contains(5) || list.contains(6) || list.contains(7)) == false )
                {
                    count++;

                }
            }
        }
        return count + ((n - map.size()) * 2);
    }
}
