class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String arr[] = text.split(" "); //Convert to String array by splitting using space " "
        
        //base case 
        if(arr.length <= 2)
        return new String[0];

        ArrayList<String> list = new ArrayList<>();
        int i = 0, j = 1;
        while(i<arr.length && j<arr.length)
        {
            if(arr[i].equals(first) && arr[j].equals(second) && j+1 < arr.length)
            {
                list.add(arr[j+1]);
                j += 1;
                i += 1;
            }
            else 
            {
                i++;
                j++;
            }
        }
        
        String ans[] = new String[list.size()];
        for(int k = 0; k<list.size(); k++)
        {
            ans[k] = list.get(k);
        }
        return ans;
    }
}
