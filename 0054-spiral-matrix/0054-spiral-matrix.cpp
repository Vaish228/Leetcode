class Solution {
public:
    vector <int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        int rb = 0, re = m-1;
        int cb = 0, ce = n-1;
        vector <int> res;
        if (matrix.empty()) {
            return res;
        }
        while(rb<=re && cb<=ce)
        {
            for(int i=cb;i<=ce;i++)
                  res.push_back(matrix[rb][i]);
            rb++;
            for(int i=rb;i<=re;i++)
                  res.push_back(matrix[i][ce]);
            ce--;
            if(rb<=re){
            for(int i=ce;i>=cb;i--)
                  res.push_back(matrix[re][i]);
            re--;
               }
        if(cb<=ce)
        {
            for(int i=re;i>=rb;i--)
                 res.push_back(matrix[i][cb]);
            cb++;     
        }
                  
        }
       
        return res;
    }
};