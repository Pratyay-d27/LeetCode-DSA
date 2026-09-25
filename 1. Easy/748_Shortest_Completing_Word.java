//Brute Force solution

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        ArrayList<String> list = new ArrayList<>(); //Declaring ArrayList to store the strings satisfying the question 
        int minLength = Integer.MAX_VALUE;

        String str = licensePlate.toLowerCase();
        int keyFreq[] = new int[26];
        for(char ele: str.toCharArray())
        if(ele >= 'a' && ele <= 'z')
        keyFreq[ele - 'a']++;

        for(String ele: words)
        {
            int freq[] = new int[26];

            for(char ch: ele.toCharArray())
            if(ch >= 'a' && ch <= 'z')
            freq[ch - 'a']++;

            boolean match = true;
            for(int i = 0; i<26; i++)
            {
                if(keyFreq[i] != 0 && keyFreq[i] - freq[i] > 0)
                {
                    match = false;
                    break;
                }
            }
            if(match == true)
            {
                list.add(ele);
                minLength = Math.min(minLength, ele.length());
            }
        }

        for(String ele: list)
        if(ele.length() == minLength)
        return ele;

        return "";
    }
}
