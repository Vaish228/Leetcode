class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for(int i=1;i<n;i++){
            int temp = curMax;

            if(nums[i] < 0){
                curMax = curMin;
                curMin = temp;
            }
                curMax = Math.max(nums[i] , curMax * nums[i]);
                curMin = Math.min(nums[i], curMin * nums[i]);

                max = Math.max(curMax, max);
            
        }
        return max;        
    }
}