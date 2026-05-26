/*
LeetCode Link: https://leetcode.com/problems/count-the-number-of-special-characters-i/?envType=daily-question&envId=2026-05-26
*/

class Solution {
    public int numberOfSpecialChars(String word) {
        char ch[] = word.toCharArray();
        Arrays.sort(ch);
        if(ch[0] >= 'a')
        return 0;
        
        ArrayList<Character> list = new ArrayList<>();
        int i = 0;
        while(i<word.length() && ch[i] < 'a')
        {
            list.add(ch[i]);
            i++;
        }
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int j = i; j<word.length(); j++)
        set.add(ch[j]);
        for(char ele: set)
        {
            if(list.contains((char)(ele - 32)))
            count++;
        }
        return count;
    }
}
