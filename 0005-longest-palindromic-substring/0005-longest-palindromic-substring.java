class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > max) {
                    max = r - l + 1;
                    start = l;
                }
                l--;
                r++;
            }

            // Even-length palindrome
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > max) {
                    max = r - l + 1;
                    start = l;
                }
                l--;
                r++;
            }
        }

        return s.substring(start, start + max);
    }
}