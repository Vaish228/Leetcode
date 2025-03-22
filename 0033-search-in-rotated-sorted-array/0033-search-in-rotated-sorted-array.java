class Solution {
    public int search(int[] nums, int target) {
        
     int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) {
                // Left side is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;  // Target is in the left sorted part
                } else {
                    left = mid + 1;  // Target is in the right part
                }
            } else {
                // Right side is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;  // Target is in the right sorted part
                } else {
                    right = mid - 1;  // Target is in the left part
                }
            }
        }

        return -1;
}
}