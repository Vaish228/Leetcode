class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //         return i;
        // }
        // return -1;

        Arrays.sort(nums);
        int l=0;
        int m;
        int h=nums.length-1;
        while(l<=h)
        {
            m=l+(h-l)/2;
            if(nums[m]==target) 
                return m;
            else if(nums[m]<target)  
                l=m+1;
            else  
                h=m-1;
        }
        return -1;

        
    }
}