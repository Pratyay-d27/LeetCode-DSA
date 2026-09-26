class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> ele: knowledge)
        map.put(ele.get(0), ele.get(1));
        
        String str = "";
        for(int i = 0; i<s.length();)
        {
            char ch = s.charAt(i); // current character being scanned

            if(ch != '(' && ch != ')')
            str += ch;
            else if(ch == '(')
            {
                i++;
                String temp = "";
                while(s.charAt(i) != ')')
                {
                    temp += s.charAt(i++);
                }
                String value = "?";
                if(map.containsKey(temp))
                value = map.get(temp);

                str += value;
            }
            i++;
        }
        return str;
    }
}
