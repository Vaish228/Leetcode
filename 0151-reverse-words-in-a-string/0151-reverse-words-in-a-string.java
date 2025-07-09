class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" +");
        int a = str.length;
        int j=0;
        String[] st = new String[a];
        for(int i=a-1;i>=0;i--){
            st[j++] = str[i];
        }
        return String.join(" ",st);
    }
}