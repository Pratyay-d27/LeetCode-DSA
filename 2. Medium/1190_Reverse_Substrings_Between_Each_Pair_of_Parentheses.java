class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        
        int[][] arr = new int[n / 2][2];
        int pairCount = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // Store the opening index
            } else if (s.charAt(i) == ')') {
                int openIdx = stack.pop(); // Match it with the nearest open index
                arr[pairCount][0] = openIdx;
                arr[pairCount][1] = i;
                pairCount++;
            }
        }

        char ch[] = s.toCharArray();     
        
        for (int i = 0; i < pairCount; i++) {
            int start = arr[i][0], end = arr[i][1];
            reverse(start, end, ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ele : ch) {
            if (ele >= 'a' && ele <= 'z') {
                sb.append(ele);
            }
        }

        return sb.toString();
    }

    void reverse(int i, int j, char ch[]) {
        while (i < j) {
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
    }
}
