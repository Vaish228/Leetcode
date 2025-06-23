class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int in = n-2;
        while(in>=0 && nums[in]>=nums[in+1])
            in--;

        if(in>=0)
        {
            int sw = binarySearch(nums, in+1, n-1, nums[in]);
            swap(nums, in, sw);
        }    
        reverse(nums, in+1, n-1);
    }
    private int binarySearch(int[] nums, int left, int right, int target) {
        int ans = left;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}