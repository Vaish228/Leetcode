class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        int m = 0;
        for(int k : mp.keySet())
        {
            if(mp.containsKey(k+1))
            {
                int l = mp.get(k)+mp.get(k+1);
                if(m<=l)
                    m=l;
            }
        }
        return m;
    }

}