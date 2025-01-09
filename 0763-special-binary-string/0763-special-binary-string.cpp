class Solution {
public:
    string makeLargestSpecial(string s) {
        int c=0, i=0;
        vector<string> res;
        for(int j=0;j<s.size();j++)
        {
            if(s[j]=='1') c++;
            else c--;
            if(c==0)
            {
               res.push_back('1'+makeLargestSpecial(s.substr(i+1,j-i-1))+'0');
               i=j+1;
            }
        }
            sort(res.begin(), res.end(), greater<string>());
            string r="";
            for(int i=0;i<res.size();i++)
            {
                r+=res[i];
            }
          return r;
    }
};