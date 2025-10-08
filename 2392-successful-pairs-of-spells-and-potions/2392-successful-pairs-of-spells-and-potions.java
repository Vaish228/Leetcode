/*Two Pointer Solution */
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);

        int n = spells.length;
        int[] ans = new int[n];

        // Create an index array to remember the original positions of spells
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;

        // Sort indices based on spell strength in ascending order
        // So we process weaker spells first, stronger spells later
        Arrays.sort(indices, (a, b) -> Integer.compare(spells[a], spells[b]));
        // Example:
        // spells = [3, 1, 2]
        // indices after sorting → [1, 2, 0]  (spell values 1, 2, 3)

        // Initialize pointer 'j' to the last potion (strongest)
        for (int i = 0, j = potions.length - 1; i < n; i++) {
            int si = indices[i];     
            int spell = spells[si];  

            // Move 'j' left while the potion is strong enough to achieve success
            // Once (potions[j] * spell) < success, stop (since potions are sorted ascending)
            while (j >= 0 && (long) potions[j] * spell >= success) {
                j--;
            }


            // All potions from (j + 1) to end of array will make a successful pair with this spell.
            
            ans[si] = potions.length - j - 1; 
        }

        return ans;
    }
}