class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;  // This is the first character to appear twice
            }
            seen.add(ch);
        }

        return ' '; 
    }
}