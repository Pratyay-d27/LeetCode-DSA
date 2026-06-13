class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String str = "";
        for(int i =0; i<words.length; i++)
        {
            int weight = 0;
            for(char ch: words[i].toCharArray())
            {
                weight += weights[ch - 'a'];
            }
            str += (char)(122 - (weight % 26));
        }
        return str;
    }
}
