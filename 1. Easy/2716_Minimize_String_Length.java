*/
LeetCode Link: https://leetcode.com/problems/minimize-string-length/
*/
//Soltion Using HashSet
class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char ele: s.toCharArray())
        set.add(ele);
        return set.size();
    }
}
