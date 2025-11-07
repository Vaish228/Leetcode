class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stations[i];
        }

        long[] power = new long[n];
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(n - 1, i + r);
            power[i] = prefix[right + 1] - prefix[left];
        }

        long left = 0, right = 0;
        for (long p : power) right = Math.max(right, p + k);
        long ans = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (canAchieve(power, r, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private boolean canAchieve(long[] power, int r, long k, long target) {
        int n = power.length;
        long[] added = new long[n];
        long used = 0, windowAdd = 0;

        for (int i = 0; i < n; i++) {
            if (i - (r * 2 + 1) >= 0) {
                windowAdd -= added[i - (r * 2 + 1)];
            }

            long curr = power[i] + windowAdd;
            if (curr < target) {
                long need = target - curr;
                used += need;
                if (used > k) return false;
                added[i] = need;
                windowAdd += need;
            }
        }
        return true;
    }
}