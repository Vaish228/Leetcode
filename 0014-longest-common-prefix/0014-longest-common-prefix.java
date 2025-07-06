class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] l1 = strs[0].toCharArray();
        char[] l2 = strs[strs.length-1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<l1.length;i++)
        {
            if(l1[i]!=l2[i])
                break;
            sb.append(l1[i]);    
        }
        return sb.toString();

    }
}