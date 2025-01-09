class Solution {
public:
    string shortestPalindrome(string s) {
        int n = s.size();
        int i=0, j=n-1;
        while(j>=0)
        {
            if(s[i]==s[j])
               i++;
            j--;
        }
        string r = s.substr(i);
        if(r.size()==0)
            return s;
        string st = r;
        reverse(st.begin(),st.end());
        return st +  shortestPalindrome(s.substr(0,i)) + r;    
    }
};