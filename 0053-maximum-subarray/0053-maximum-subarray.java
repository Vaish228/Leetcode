class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int s =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(max<s)
                max = s;
            if(s<0)
                s=0;
        }
        // System.out.println(max);
        return max;
    }
}