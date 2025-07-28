class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        
        // Prefix sum of travel times
        int[] prefixTravel = new int[n];
        for (int i = 1; i < n; i++) {
            prefixTravel[i] = prefixTravel[i - 1] + travel[i - 1];
        }

        // Total time: picking up all garbage
        int totalTime = 0;
        int lastM = 0, lastP = 0, lastG = 0;

        for (int i = 0; i < n; i++) {
            String g = garbage[i];
            totalTime += g.length(); // 1 minute per garbage
            if (g.contains("M")) lastM = i;
            if (g.contains("P")) lastP = i;
            if (g.contains("G")) lastG = i;
        }

        // Add travel times for each truck up to its last house
        totalTime += prefixTravel[lastM] + prefixTravel[lastP] + prefixTravel[lastG];

        return totalTime;
    }
}
