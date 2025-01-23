class Solution {
public:
    int longestStrChain(vector<string>& words) {
    //     sort(words.begin(), words.end(), [](const string& a, const string& b) {
    //     return a.size() < b.size();
    // });
    // unordered_map<string, int> dp;

    // int maxLength = 0;

    // for (const string& word : words) {
    //     dp[word] = 1; 

    //     for (int i = 0; i < word.size(); ++i) {
    //         string predecessor = word.substr(0, i) + word.substr(i + 1);

    //         if (dp.count(predecessor)) {
    //             dp[word] = max(dp[word], dp[predecessor] + 1);
    //         }
    //     }

    //     maxLength = max(maxLength, dp[word]);
    // }

    // return maxLength;
    // }


    unordered_map<string, int> dp;
    int ans=0;
    sort(words.begin(), words.end(), sortByLength);

    for(string wor : words)
    {
        for(int i=0;i<wor.length();i++)
        {
            string pre=wor.substr(0,i)+wor.substr(i+1);
            dp[wor]=max(dp[wor],dp[pre]+1);
        }
        ans = max(ans,dp[wor]);
    }
    return ans;
    }

    static bool sortByLength(string &s1, string &s2){
        return s1.length()<s2.length();
    }

};