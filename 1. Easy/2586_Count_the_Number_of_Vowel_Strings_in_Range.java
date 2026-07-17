class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left; i <= right; i++)
        {
            if( "aeiou".indexOf(words[i].charAt(0)) != -1 && "aeiou".indexOf(words[i].charAt(words[i].length()-1)) != -1 )
            count++;
        }
        return count;
    }
}
