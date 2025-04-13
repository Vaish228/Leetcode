class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1,-1};
        int l = bs(nums, target, true);
        int r = bs(nums, target, false);
        result[0]=l;
        result[1]=r;
        return result;
    }
    public static int bs(int[] nums, int target, boolean sea)
    {
        int l=0;
        int h=nums.length-1;
        int idx =-1;
        while(l<=h)
        {
            int m  = (l+h)/2;
            if(nums[m]==target)
            {
                idx = m;
                if(sea)
                    h=m-1;
                else
                    l=m+1;    
            }
            else if(nums[m]<target)
                l=m+1;
            else
                h=m-1;    

        }
        return idx;
    }
}