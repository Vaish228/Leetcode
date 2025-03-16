class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        // for(int i=0;i<l;i++)
        // {
        //     for(int j=i+1;j<l;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //             return new int[] {i,j};
        //     }
        // }
        // return new int[] {};
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<l;i++)
        {
            mp.put(nums[i],i);
        }
        for(int i=0;i<l;i++)
        {
            int j = target-nums[i];
            if(mp.containsKey(j) && mp.get(j)!=i)
                return new int[]{i, mp.get(j)};
        }
        return new int[]{};
    }
}