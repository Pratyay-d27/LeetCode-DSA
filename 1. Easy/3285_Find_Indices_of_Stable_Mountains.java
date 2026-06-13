class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> list = new ArrayList<>(); //final list to be returned 
        for(int i = 1; i<height.length; i++)
        {
            if(height[i-1] > threshold)
            list.add(i);
        } 
        return list;
    }
}
