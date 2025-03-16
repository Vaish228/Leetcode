class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {  
            s.add(num);
        }

        int lc = 0;
        for (int num : nums) {
            if (!s.contains(num - 1)) {  
                int current = num;
                int cur_count = 1;

                while (s.remove(current + 1)) {
                    current++;
                    cur_count++;
                }

                lc = Math.max(cur_count, lc);
            }
        }
        return lc;
    }
} 