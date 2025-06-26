class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            boolean f1 = nums[i]%2==0 ;
            boolean f2 = nums[i+1]%2==0;
            if((f1^f2) == false) 
                return false;
        }
        return true;
    }
}