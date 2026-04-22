/*
LeetCode Link: https://leetcode.com/problems/words-within-two-edits-of-dictionary/?envType=daily-question&envId=2026-04-22
*/

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<queries.length; i++)
        {
            if(check(queries[i], dictionary))
            list.add(queries[i]);
        }
        return list;
    }
    static boolean check(String str, String words[])
    {
        int diff = 0, i, j;
        for(i = 0; i<words.length; i++)
        {
            if(str.length() == words[i].length())
            {
                diff = 0;
                for(j = 0; j<words[i].length(); j++)
                {
                    if(words[i].charAt(j) != str.charAt(j))
                    diff++;
                    if(diff>2)
                    break;
                }
                if(diff <=2 && j == str.length())
                return true;
            }
        }
        return false;
    }
}
