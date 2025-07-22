class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int l = nums.length;
        for(int i=0;i<l;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<l;i++){
            int j = target - nums[i];
            if(mp.containsKey(j) && mp.get(j)!=i)
                return new int[]{i,mp.get(j)};
        }
        return new int[]{};
    }
}
