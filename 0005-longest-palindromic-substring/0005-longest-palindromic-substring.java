class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        // If the string has less than 2 characters, it is already a palindrome
        if (n < 2) {
            return s;
        }

        // Initialize variables to track the longest palindrome substring
        String sub = s.substring(0, 1);
        int curr = 1;

        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            
            // Check for palindromes with odd length
            int start = i, end = i;
            while (start >= 0 && end < n && s.charAt(start) == s.charAt(end)) {
                // If the current substring is longer than the previously recorded one,
                // update 'sub' and 'curr' accordingly
                if (end - start + 1 > curr) {
                    sub = s.substring(start, end + 1);
                    curr = end - start + 1;
                }
                // Expand the substring by moving the start and end pointers
                start--;
                end++;
            }

            // Check for palindromes with even length
            start = i;
            end = i + 1;
            while (start >= 0 && end < n && s.charAt(start) == s.charAt(end)) {
                // If the current substring is longer than the previously recorded one,
                // update 'sub' and 'curr' accordingly
                if (end - start + 1 > curr) {
                    sub = s.substring(start, end + 1);
                    curr = end - start + 1;
                }
                // Expand the substring by moving the start and end pointers
                start--;
                end++;
            }
        }
        return sub;
    }
}