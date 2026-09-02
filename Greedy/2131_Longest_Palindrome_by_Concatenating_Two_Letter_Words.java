//Greedy Solution 

class Solution {
    public int longestPalindrome(String[] words) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(String ele: words)
        {
            if(map.containsKey(ele) == false)
            map.put(ele, 1);
            else 
            map.put(ele, map.get(ele)+1);
        }

        boolean centreUsed = false;
        for(String key: words)
        {
            String yek = ""; 
            yek += key.charAt(1);
            yek += key.charAt(0);
            if(map.containsKey(key) && map.containsKey(yek) && key.equals(yek) == false && map.get(key)>0 && map.get(yek) > 0)
            {
                count += 4;
                map.put(key, map.get(key)-1);
                map.put(yek, map.get(yek)-1);
            }
            if(map.containsKey(key) && map.containsKey(yek) && key.equals(yek) == true)
            {
                if(map.get(key) > 1)
                {
                    count += 4;
                    map.put(key, map.get(key)-2);
                }
                else if(map.get(key) == 1 && centreUsed == false)
                {
                    count += 2;
                    map.put(key, map.get(key)-1);
                    centreUsed = true;
                }
            }
        }
        return count;
    }
}
