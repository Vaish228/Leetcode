class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for(int p : piles){
            r = Math.max(r,p);
        }
        int res = r;

        while(l<=r){
            int mid = l+(r-l)/2;
            if (func(piles, h, mid))
            {
                res = mid;
                r=mid-1;
            }
            else
                l= mid+1;
        }
        return res;
    }
    public boolean func(int[] piles, int h, int k){
        long hrs=0;
        for(int p : piles){
            hrs+=(p+k-1)/k;
        }
        return hrs<=h;
    }
}