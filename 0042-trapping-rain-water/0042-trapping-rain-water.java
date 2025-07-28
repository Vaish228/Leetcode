class Solution {
    public int trap(int[] height) {
        // int res=0;
        // for(int i=1;i<height.length-1;i++){
        //     int l = height[i];
        //     for(int j=0;j<i;j++){
        //         l = Math.max(l,height[j]);
        //     }
        //     int r = height[i];
        //     for(int j=i+1;j<height.length;j++){
        //         r = Math.max(r,height[j]);
        //     }
        //     res+=Math.min(l,r)-height[i];
        // }
        // return res;

        int n = height.length;

        int l[] = new int[n];
        int r[] = new int[n];

        l[0] = height[0];
        for(int i=1;i<n;i++){
            l[i] = Math.max(l[i-1],height[i]);
        }

        r[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            r[i] = Math.max(r[i+1],height[i]);
        }

        int res = 0;
        for(int i=1;i<n;i++){
            res+=Math.min(l[i],r[i]) - height[i];
        }

        return res;
    }
}