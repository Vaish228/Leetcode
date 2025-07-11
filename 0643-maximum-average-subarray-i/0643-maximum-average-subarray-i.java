class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0, r=0;
        int n = nums.length;
        int s=0;
        int max = Integer.MIN_VALUE;
        while(r<n)
        {
            s+=nums[r];
            if(r-l+1 == k){
                max = Math.max(max, s);
                s-=nums[l];
                l++;
            }
            r++;
            
            //System.out.println(max);
        }
        return (double)max/k;
    }
}