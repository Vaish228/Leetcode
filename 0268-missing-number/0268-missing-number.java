class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s =0;
        int a =0;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
        }  
        int d = (n*(n+1))/2;
        a=d-s;
        return a;
    }
}