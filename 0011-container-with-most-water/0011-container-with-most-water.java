class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int max =0;
        while(i<j && j>=0)
        {
            int t = Math.min(height[i],height[j])*(j-i);
            if(t>max) max =t;
            else if(height[i]<height[j]) i++;
            else j--;
        }
        return max;

    }
}