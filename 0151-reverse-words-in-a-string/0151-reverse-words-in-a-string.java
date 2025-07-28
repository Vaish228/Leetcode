class Solution {
    public String reverseWords(String s) {
        String[] st = s.trim().split("\\s+");
        int a = st.length;
        String[] str = new String[a];
        int j=0;
        for(int i=a-1;i>=0;i--){
            str[j++] = st[i];
        }
        return String.join(" ",str);
    }
}