class Solution {
    public String[] createGrid(int m, int n) {
        String ans[] = new String[m];
        int count = 0;
        for(int i = 0; i<m; i++)
        {
            String str = "";
            for(int j = 0; j<n; j++)
            {
                if(j == 0 || i == m-1)
                str += ".";
                else 
                str += "#";
            }
            ans[count++] = str;
        }
        return ans;
    }
}
