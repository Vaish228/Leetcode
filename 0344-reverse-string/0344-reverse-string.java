class Solution {
    public void reverseString(char[] s) {
        int l=0;
        char t;
        int r=s.length-1;
        while(l<r)
        {
            t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }
    }
}