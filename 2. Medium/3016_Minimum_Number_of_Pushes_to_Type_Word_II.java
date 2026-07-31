class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        for(char ch: word.toCharArray())
        {
            freq[ch - 'a']++;
        }
        int i = 1;
        ArrayList<Character> list = new ArrayList<>();
        while(i <= 26)
        {
            int key = -1, max = 0;
            for(int j = 0; j<freq.length; j++)
            {
                if(freq[j] > max && freq[j] != 0)
                {
                    key = j;
                    max = freq[key];
                }
            }
            if(key != -1)
            {
                list.add((char) ('a' + key));
                freq[key] = -1;
            }
            i++;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(i = 0; i<list.size(); i++)
        {
            char ch = list.get(i);
            if(i < 8)
            map.put(ch, 1);
            else if(i<16)
            map.put(ch, 2);
            else if(i < 24)
            map.put(ch, 3);
            else if(i>=24)
            map.put(ch, 4);
        }
        //proceed with map from here on
        int count = 0;
        for(char ele: word.toCharArray())
        {
            count += map.get(ele);
        }
        return count; 
    }
}
