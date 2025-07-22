class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        while(l<r)
        {
            int cuheight = Math.min(height[l],height[r]);
            int cuwidth = r-l;
            int cursum = cuheight*cuwidth;

            maxArea = Math.max(maxArea, cursum);

            if(height[l]<height[r])
                l++;
            else
                r--;                
        }
        return maxArea;

    }
}