class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder r = new StringBuilder();
        int m = Math.max(word1.length(), word2.length());
        for(int i=0;i<m;i++)
        {
           if(i<word1.length())
           {
            r.append(word1.charAt(i));
           }
           if(i<word2.length())
           {
            r.append(word2.charAt(i));
           }
        }
        return r.toString();
    }
}