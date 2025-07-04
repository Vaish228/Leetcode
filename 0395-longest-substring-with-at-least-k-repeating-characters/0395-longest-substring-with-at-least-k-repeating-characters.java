class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()<k) return 0;
        int[] f = new int[26];
        for(char c : s.toCharArray())
        {
            f[c-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(f[s.charAt(i)-'a']<k)
            {
                int l = longestSubstring(s.substring(0,i),k);
                int r = longestSubstring(s.substring(i+1),k);
                return Math.max(l,r);
            }
        }
        return s.length();
    }
}