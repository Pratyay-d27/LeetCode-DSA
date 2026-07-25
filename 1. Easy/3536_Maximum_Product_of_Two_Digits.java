class Solution {
    public int maxProduct(int n) {
        if(n < 100)
        return (n%10) * (n/10);
        
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0)
        {
            list.add(n%10);
            n = n/10;
        }
        Collections.sort(list);
        return list.get(list.size()-1) * list.get(list.size()-2);
    }
}
