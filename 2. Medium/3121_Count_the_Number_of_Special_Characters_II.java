class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = n-1; i>=0; i--)
        {
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                set.add(ch);
                map.putIfAbsent(ch, i);
            }
            char ch2 = word.charAt(n-1-i);
            if(ch2 >= 'A' && ch2 <= 'Z')
            map.putIfAbsent(ch2, n-1-i);
        }
        int count = 0;
        for(char ch: set)
        {
            char ele = ((char)(ch - 32));
            if(map.containsKey(ele))
            {
                int lower = map.get(ch);
                int upper = map.get(ele);
                if(lower < upper)
                count++;
            }
        }
        return count;
    }
}
