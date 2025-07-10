class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i:nums)
        {
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> en = new ArrayList<>(mp.entrySet());
        en.sort((a,b)->b.getValue()-a.getValue());
        int a = en.get(0).getKey();
        return a;
    }
}