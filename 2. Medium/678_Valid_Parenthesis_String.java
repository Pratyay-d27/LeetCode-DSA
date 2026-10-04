class Solution {
    public boolean checkValidString(String s) {
        // FORWARD PASS: Check if we have too many ')'
        int balance = 0;
        for (char ele : s.toCharArray()) {
            if (ele == '(' || ele == '*') {
                balance++;
            } else {
                balance--; 
            }
            
            if (balance < 0) return false;
        }

        // BACKWARD PASS: Check if we have too many '('
        balance = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ele = s.charAt(i);
            if (ele == ')' || ele == '*') {
                balance++; 
            } else {
                balance--; 
            }
            
            if (balance < 0) return false;
        }

        return true;
    }
}
