class Solution {
    public int findClosestNumber(int[] nums) {
        int m = nums[0];
        for(int i=1;i<nums.length;i++){
            if (Math.abs(nums[i]) < Math.abs(m)) {
                m = nums[i];
            } 
            else if (Math.abs(nums[i]) == Math.abs(m) && nums[i] > m) {
                m = nums[i];
            }       
        }
        return m;
    }
}