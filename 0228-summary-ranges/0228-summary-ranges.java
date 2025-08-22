class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        int i=0;
        while(i<n){
            int st = nums[i];
            while(i<n-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(st != nums[i]){
                list.add(st+"->"+nums[i]);
            }
            else
                list.add(String.valueOf(nums[i]));
            i++;    
        }
        return list;
    }
}