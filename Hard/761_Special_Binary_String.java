/*
LeetCode Link: https://leetcode.com/problems/special-binary-string/
*/

class Solution {
    public String makeLargestSpecial(String s) {
        if(s == "")
        return "";
        ArrayList<String> li = new ArrayList<>();
        int start = 0, sum = 0;
        for(int i = 0; i<s.length(); i++)
        {
            sum += (s.charAt(i) == '1')? 1:-1;
            if(sum == 0)
            {
                li.add('1' + makeLargestSpecial(s.substring(start+1, i)) + '0');
                start = i+1;
            }    
        }
        String result = "";
        Collections.sort(li, Collections.reverseOrder());
        for(String ele: li)
        result += ele;
        return result;
    }
}
