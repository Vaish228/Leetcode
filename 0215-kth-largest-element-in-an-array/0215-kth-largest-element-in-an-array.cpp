class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) { 
        //sort(nums.begin(), nums.end());
        //return nums[nums.size()-k];
        priority_queue<int>q(nums.begin(), nums.end());
        int l = 1;
        while(l!=k)
        {
            q.pop();
            l++;
        }
        return q.top();
    }
};