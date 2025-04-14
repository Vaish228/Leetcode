class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];

        // int l=0;
        // int r=nums.length-1;
        // while(l<r)
        // {
        //     int m=l+(r-l)/2;
        //     if(nums[m]>nums[r])
        //         l=m+1;
        //     else
        //         r=m;    
        // }
        // return nums[l];

        int m = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(m>nums[i])
                m=nums[i];
        }
        return m;
    }
}