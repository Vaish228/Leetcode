class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int c =0 , m =0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
               c++;
            else //if((nums[i]==0) || i=n-1)
            {
                if(c>m)
                   m=c;
                c=0;   
            }   
        }
        return Math.max(c,m);
    }
}