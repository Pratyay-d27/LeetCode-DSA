class Solution {
    public int passwordStrength(String password) {
        //creating HashSet
        HashSet<Character> set = new HashSet<>();
        for(char ch: password.toCharArray())
        set.add(ch);
        
        //calculate sterength
        int str = 0;
        for(char ch: set)
        {
            if(ch >= 'a' && ch<= 'z')
            str+=1;
            else if(ch>= 'A' && ch<= 'Z')
            str+=2;
            else if(ch>='0' && ch<= '9')
            str+=3;
            else 
            str+=5;
        }
        return str; 
    }
}
