class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>(); // declaring 
        int n = digits.length;
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                for(int k = 0; k<n; k++)
                {
                    int a = digits[i];
                    int b = digits[j];
                    int c = digits[k];
                    if(i != j && j != k && i != k)
                    {
                        int num = a*100 + b * 10 + c;
                        if(num >= 100 && num <= 999 && num % 2 == 0 && set.contains(num) == false)
                        {
                            count++;
                            set.add(num);
                        }
                    }
                }
            }
        }
        return count;
    }
}
