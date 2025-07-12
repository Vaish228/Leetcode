class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int l=0,r=0,j=0,i=0;
        int s=0,c=0;
        while(r<n){
            s+=arr[r];
            if(r-l+1 == k){
                j=s/k;
                if(j>=threshold)
                    c++;
                s-=arr[l];    
                l++;    
            }
            r++;
        }
        return c;
    }
}