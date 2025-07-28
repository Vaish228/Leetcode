class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int n = garbage.length;
        int[] prev = new int[n];
        for(int i=1;i<n;i++){
            prev[i] = prev[i-1]+travel[i-1];
        }

        int tT=0;
        int lG=0, lP=0, lM=0;
        for(int i=0;i<n;i++){
            String g = garbage[i];
            tT+=g.length();
            if(g.contains("M")) lM=i;
            if(g.contains("P")) lP=i;
            if(g.contains("G")) lG=i;
        }
        tT+=prev[lM]+prev[lG]+prev[lP];
        return tT;
    }
}