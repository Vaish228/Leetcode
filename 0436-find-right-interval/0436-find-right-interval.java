class Solution {
    public int[] findRightInterval(int[][] intervals) {
      int n = intervals.length;
        int[] result = new int[n];

        // Step 1: Store start values with their original indices
        int[][] startWithIndex = new int[n][2]; // [start, originalIndex]
        for (int i = 0; i < n; i++) {
            startWithIndex[i][0] = intervals[i][0]; // start
            startWithIndex[i][1] = i;               // index
        }

        // Step 2: Sort based on start values
        Arrays.sort(startWithIndex, (a, b) -> a[0] - b[0]);

        // Step 3: For each interval, binary search for right interval
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int left = 0, right = n - 1;
            int index = -1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (startWithIndex[mid][0] >= end) {
                    index = startWithIndex[mid][1];
                    right = mid - 1; // search for smaller valid start
                } else {
                    left = mid + 1;
                }
            }

            result[i] = index;
        }

        return result;
        
    }
}