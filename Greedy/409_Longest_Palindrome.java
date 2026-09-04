class Solution {
    public int longestPalindrome(String s) {
        int lower[] = new int[26];
        int capital[] = new int[26];

        for(char ele: s.toCharArray())
        {
            if(ele >= 'a')
            lower[ele - 'a']++;
            else 
            capital[ele - 'A']++;
        }

        int length = 0;
        boolean once = false;
        for(int i = 0; i<26; i++)
        {
            if(lower[i] > 1)
            {
                length += (lower[i] / 2) * 2;
                lower[i] = lower[i] % 2;
            }
            if(capital[i] > 1)
            {
                length += (capital[i] / 2) * 2;
                capital[i] = capital[i] % 2;
            }

            if(lower[i] == 1 && once == false)
            {
                length += 1;
                once = true;
            }
            if(capital[i] == 1 && once == false)
            {
                length += 1;
                once = true;
            }
        }
        return length;
    }
}
