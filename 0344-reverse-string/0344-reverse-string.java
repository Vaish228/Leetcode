class Solution {
    public void reverseString(char[] s) {
        int a = s.length;
        // char[] sb = new char[a];
        // int j=0;
        // for(int i=a-1;i>=0;i--)
        // {
        //     sb[j++] = s[i];
        // }
        // j=0;
        // for(int i=0;i<a;i++)
        // {
        //     s[j++] = sb[i];
        // }
        int c =0;
        int e = s.length-1;
        while(c<=e){
            char t = s[c];
            s[c] = s[e];
            s[e] = t;
            c++;
            e--;
        }

    }
}