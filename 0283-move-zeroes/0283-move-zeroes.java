class Solution {
    public void moveZeroes(int[] nums) {
        int no = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int t = nums[no];
                nums[no]=nums[i];
                nums[i]=t;

                no++;
            }
        }
        
    }
}