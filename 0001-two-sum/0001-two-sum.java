class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // The number we are looking for
            if (map.containsKey(complement)) {
                // Found it! Return the indexes
                return new int[]{map.get(complement), i};
            }
            // Otherwise, save the number and its index
            map.put(nums[i], i);
        }

        // No solution found
        return new int[]{-1, -1};
    }
}
