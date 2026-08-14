class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[] = new int[26]; //for keeping track of the frequency of each character 
        //using freq array here instead of hashmap to improve the time complexity 
        int i = 0, j = 0, max = 0;
        while(j<s.length())
        {
            int key = s.charAt(j) - 'a';
            freq[key]++;

            if(freq[key] <= 2)
            max = Math.max(max, j-i+1);

            while(freq[key] > 2)
            {
                freq[s.charAt(i) - 'a']--;
                i++;
            }

            j++;
        }
        return max;
    }
}
