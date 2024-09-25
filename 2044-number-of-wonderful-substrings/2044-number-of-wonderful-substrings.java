class Solution {
    public long wonderfulSubstrings(String word) {
          Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        
        int mask = 0;  
        long count = 0;
        
        for (char c : word.toCharArray()) {
            mask ^= 1 << (c - 'a');
            count += freq.getOrDefault(mask, 0);
            for (int i = 0; i < 10; i++) {
                int toggledMask = mask ^ (1 << i);
                count += freq.getOrDefault(toggledMask, 0);
            }
            freq.put(mask, freq.getOrDefault(mask, 0) + 1);
        }
        
        return count;
    }
}