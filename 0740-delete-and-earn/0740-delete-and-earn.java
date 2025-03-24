class Solution {
    // private HashMap<Integer, Integer> pts = new HashMap<>();
    // private HashMap<Integer, Integer> cache = new HashMap<>();
    // private int MP(int m)
    // {
    //     if(m==0)  return 0;
    //     if(m==1)  return pts.getOrDefault(1,0);
    //     if(cache.containsKey(m))
    //         return cache.get(m);
    //     int g = pts.getOrDefault(m,0);
    //     cache.put(m,Math.max(MP(n))) ;   
    // }
    public int deleteAndEarn(int[] nums) {
        // int mn=0;
        // for(int i: nums)
        // {
        //     pts.put(nums, pts.getOrDefault(i,0)+i);
        //     mn = Math.max(mn,i);
        // }
        // return MP(mn);
        
        // int n = 10001;
        // int[] values = new int[n];
        // for (int num : nums)
        //     values[num] += num;

        // int take = 0, skip = 0;
        // for (int i = 0; i < n; i++) {
        //     int takei = skip + values[i];
        //     int skipi = Math.max(skip, take);
        //     take = takei;
        //     skip = skipi;
        // }
        // return Math.max(take, skip);
        int max = 0;
    for (int num : nums) {
        max = Math.max(max, num);
    }

    int[] points = new int[max + 1];
    for (int num : nums) {
        points[num] += num;
    }

    int[] dp = new int[max + 1];
    dp[0] = 0;
    dp[1] = points[1];

    for (int i = 2; i <= max; i++) {
        dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);
    }

    return dp[max];
    }
}