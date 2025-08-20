class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] s1 = strs[0].toCharArray();
        char[] s2 = strs[strs.length-1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]!=s2[i])
                break;
            sb.append(s1[i]);    
        }
        return sb.toString();
    }
}