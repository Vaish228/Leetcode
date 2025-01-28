class Solution {
public:
    bool canJump(vector<int>& nums) {
        int max=0;
        for(int i=0;i<nums.size();i++)
        {
            int v = nums[i];
            int j = v+i;
            if(i>max) return false;
            if(max<j)
            {
                max=j;
                j=0;
            }
            if(max>=nums.size()-1)
           return true;
        }
        return false;
    }
};