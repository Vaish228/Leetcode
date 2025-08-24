class Solution {
    public int majorityElement(int[] nums) {
    //  int can = nums[0];
    //     int c = 1;
    //     for(int i=1;i<nums.length;i++)
    //     {
    //         if(nums[i]==can)
    //             c++;
    //         else
    //             c--;

    //         if(c==0)
    //         {
    //             can=nums[i];
    //             c=1;
    //         }        
    //     }
    //     return can;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i: nums){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> en = new ArrayList<>(mp.entrySet());
        en.sort((a,b)->b.getValue()-a.getValue());
        return en.get(0).getKey();
    }
}