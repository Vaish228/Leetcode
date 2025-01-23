class Solution {
public:
    int longestStrChain(vector<string>& words) {
         sort(words.begin(), words.end(), [](const string& a, const string& b) {
        return a.size() < b.size();
    });

    // Create a hashmap to store the longest chain ending at each word
    unordered_map<string, int> dp;

    int maxLength = 0;

    for (const string& word : words) {
        dp[word] = 1; // Initialize with a chain of length 1

        for (int i = 0; i < word.size(); ++i) {
            // Create a predecessor by removing the ith character
            string predecessor = word.substr(0, i) + word.substr(i + 1);

            // If the predecessor exists in the hashmap, update the current chain length
            if (dp.count(predecessor)) {
                dp[word] = max(dp[word], dp[predecessor] + 1);
            }
        }

        maxLength = max(maxLength, dp[word]);
    }

    return maxLength;
    }
};