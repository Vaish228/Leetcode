// const 
// class Solution {
// public:
//     int numWays(vector<string>& words, string target) {
//         int mod = 1e9 + 7;
//           int l = words.size();
//         int n=words[0].size();
//         int m=target.size();

//     vector<vector<int>> f(n,vector<int>(26,0));
    // for(int i=0;i<l;i++){
    //     const string& w = words[i];
    //     for(int j=0;j<n;j++)
    //     {
    //         f[j][w[j] - 'a']++;
    //     }
    // }
//     for (const string& word : words) {
//     for (int j = 0; j < n; ++j) {
//         f[j][word[j] - 'a']++;
//     }
// }
//     vector<long long>dp(m+1,0);
//     dp[0]=1;

//     for(int i=0;i<n;i++)
//     {
//         for(int j=m-1;j>=0;j--)
//         {
//             int id = target[i]-'a';
//             dp[j+1] = (dp[j+1]+dp[j]*f[j][id]) % mod;
//         }
//     }
//         return dp[m];
//     }
// };


class Solution {
public:
    int numWays(vector<string>& words, string target) {

           int mod = 1e9 + 7;
           int l = words.size();
           int m = target.size();
           int n = words[0].size();

    vector<vector<int>> f(n, vector<int>(26, 0));
    // for (const string& w : words) {
    //     for (int j = 0; j < n; j++) {
    //         f[j][w[j] - 'a']++;
    //     }
    // }

    for(int i=0;i<l;i++){
        const string& w = words[i];
        for(int j=0;j<n;j++)
        {
            f[j][w[j] - 'a']++;
        }
    }
    vector<long long> dp(m + 1, 0);
    dp[0] = 1; 

    
    for (int j = 0; j < n; j++) {
        for (int i = m - 1; i >= 0; i--) { 
            int ind = target[i] - 'a';
            dp[i + 1] = (dp[i + 1] + dp[i] * f[j][ind]) % mod;
        }
    }

    return dp[m];
    }
};