class Solution {
public:
    int timeDifference(string &s1, string &s2)
    {
        int h1 = stoi(s1.substr(0,2));
        int m1 = stoi(s1.substr(3));
        int h2 = stoi(s2.substr(0,2));
        int m2 = stoi(s2.substr(3));

        int t1= h1*60 + m1;
        int t2= h2*60 + m2;

        int fd = abs(t1-t2);
        int bd = 1440 - fd;
        return min(fd, bd);
    }
    int findMinDifference(vector<string>& timePoints) {
        sort(timePoints.begin(), timePoints.end());
        int n = timePoints.size();
        int md = INT_MAX;
        for(int i=1;i<n;++i)
        {
            md = min(md, timeDifference(timePoints[i-1], timePoints[i]));
        }
        md = min(md, timeDifference(timePoints[0], timePoints[n-1]));
        return md;
    }
    
};