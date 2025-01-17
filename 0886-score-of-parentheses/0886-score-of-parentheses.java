class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Initialize with 0 to handle the outermost level

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0); // Start a new group
            } else {
                int innerScore = stack.pop(); // Score of the innermost group
                int outerScore = stack.pop(); // Score of the outer group
                int currentScore = Math.max(2 * innerScore, 1); // Apply rules
                stack.push(outerScore + currentScore); // Add to outer score
            }
        }

        return stack.pop(); 
    }
}