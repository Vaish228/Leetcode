class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l=0,r=0,s=0;
        int ml = Integer.MAX_VALUE;
        while(r<n){
            s+=nums[r];
            while(s>=target){
                ml=Math.min(ml,r-l+1);
                s-=nums[l];
                l++;
            }
            r++;
        }
        return (ml == Integer.MAX_VALUE) ? 0 : ml;
    }
}