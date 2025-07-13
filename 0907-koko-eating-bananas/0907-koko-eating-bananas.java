class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canEatAll(piles, h, mid)) {
                high = mid; // try smaller speed
            } else {
                low = mid + 1; // need faster speed
            }
        }

        return low; // minimum k found
    }

    // Helper: check if she can eat all with speed k in h hours
    private boolean canEatAll(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // same as ceil(pile / k)
        }
        return hours <= h;
    }

    // Helper: get the maximum pile size
    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
