class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9)
        return "";

        int nines = sum / 9;
        int rem = sum % 9;
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<nines; i++)
        s.append("9");

        if(rem > 0)
        s.append(Integer.toString(rem));

        if(s.length() < num)
        {
            for(int i = s.length(); i<num; i++)
            s.append("0");
        }
        return s.toString();
    }
}
