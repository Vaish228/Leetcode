class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int rows=0;
        // int colms=matrix[0].length-1;
        // while(rows<matrix.length && colms>=0){
        //     if(matrix[rows][colms]==target){
        //         return true;
        //     }else if(target<matrix[rows][colms]){
        //         colms--;
        //     }else{
        //         rows++;
        //     }
        // }
        // return false;

        int rowidx = matrix.length-1;
        int colidx = 0;
        int colbound = matrix[0].length;
        while(rowidx>=0 && colidx<colbound)
        {
            if(target==matrix[rowidx][colidx])
                return true;
            else if(target>matrix[rowidx][colidx])
                colidx++;
            else
                rowidx--;        
        }
        return false;
    }
}