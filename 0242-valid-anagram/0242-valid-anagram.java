class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        char c[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        return Arrays.equals(c,ch);
    }
}