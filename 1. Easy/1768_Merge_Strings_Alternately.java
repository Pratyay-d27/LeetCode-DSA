class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0, right = 0;
        int n1 = word1.length(), n2 = word2.length();
        String str = "";
        while(left<n1 && right<n2)
        str = str+word1.charAt(left++)+word2.charAt(right++);
        while(left<n1)
        str = str+word1.charAt(left++);
        while(right<n2)
        str = str+word2.charAt(right++);
        return str;
    }
}
