class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" +");
        int a = str.length;
        // int j=0;
        // String[] st = new String[a];
        // for(int i=a-1;i>=0;i--){
        //     st[j++] = str[i];
        // }
        int l = 0;
        int r = a-1;
        while(l<=r)
        {
            String x = str[l];
            str[l] = str[r];
            str[r] = x;
            l++;
            r--;
        }
        return String.join(" ",str);
    }
}