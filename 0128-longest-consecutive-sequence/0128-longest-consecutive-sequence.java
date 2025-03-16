class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Handle edge case

        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num); // Store all numbers in HashSet
        }

        int maxLen = 0;
        for (int num : nums) { // Iterate directly on the HashSet to avoid duplicates
            if (!s.contains(num - 1)) { // Only process sequence starters
                int currentNum = num;
                int count = 1;

                while (s.remove(currentNum + 1)) { // Remove checked elements to optimize lookup
                    currentNum++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}