class Solution {
    public void reverseString(char[] s) {
        char[] ab = new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--)
        {
            ab[j++]=s[i];
        }
        j=0;
        for(int i=0;i<ab.length;i++){
            s[j++] = ab[i];
        }
    }
}