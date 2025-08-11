class Solution {
    public int majorityElement(int[] nums) {
     int can = nums[0];
        int c = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==can)
                c++;
            else
                c--;

            if(c==0)
            {
                can=nums[i];
                c=1;
            }        
        }
        return can;
    }
}