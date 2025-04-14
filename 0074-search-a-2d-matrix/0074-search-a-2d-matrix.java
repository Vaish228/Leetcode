class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows= matrix.length;
        int cols= matrix[0].length;
        int l=0; 
        int m=0;
        int r=(rows*cols)-1;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(matrix[m/cols][m%cols] == target)
                return true;
            else if(matrix[m/cols][m%cols] > target)
                r=m-1;
            else
                l=m+1;    
        }
        return false;
    }
}