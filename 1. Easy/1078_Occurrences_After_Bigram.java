class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String arr[] = text.split(" "); //Converting to String array by splitting using space " "
        
        //base case 
        if(arr.length <= 2)
        return new String[0];

        //rest of the code
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
        
        //manually converting list to array and returning the array
        String ans[] = new String[list.size()];
        for(int k = 0; k<list.size(); k++)
        {
            ans[k] = list.get(k); //copying list elements to array
        }
        return ans; //return the final array
    }
}
