class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1; i<=num2; i++)
        {
            if(i<100)
            continue;
            ans += solve(String.valueOf(i));
        }
        return ans;
    }
    int solve(String s)
    {
        int wavy = 0;
        for(int i = 1; i<s.length()-1; i++)
        {
            int front = s.charAt(i+1) - '0', back = s.charAt(i-1) - '0', key = s.charAt(i) - '0';
            if(key > front && key > back)
            wavy++;
            else if(key < front && key < back)
            wavy++;
        }
        return wavy;
    }
}
