class Solution {
    public void gameOfLife(int[][] copy) {
        int r = copy.length;
        int c = copy[0].length;


          int[][] matrix = new int[r][c];
        
        // make a copy of the board becoz neighboyr have to check with tehir neighboyr values not with updated value
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = copy[i][j];
            }
        }
        /*for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(matrix[i][j] == 0){
                    int l = 0;
                    if(i+1 < r){
                        if(matrix[i+1][j] == 1) l++;
                    }
                    if(i-1 >=0){
                        if(matrix[i-1][j] == 1)l++;
                    }
                    if(j+1 <c ){
                        if(matrix[i][j+1] == 1) l++;

                    }
                    if(j-1 >=0){
                        if(matrix[i][j-1] ==1 )l++;
                    }
                    if(i+1 <r && j+1 < c){
                        if(matrix[i+1][j+1] ==1)l++;
                    }
                    if(i+1 < r && j-1>=0){
                        if(matrix[i+1][j-1] ==1)l++;
                    }
                    if(i-1 >=0 && j+1<c){
                        if(matrix[i-1][j+1] ==1)l++;
                    }
                    if(i-1 >=0 && j-1 >=0){
                        if(matrix[i-1][j-1] ==1) l++;
                    }

                    if(l==3){
                        copy[i][j] = 1;
                    }
                }
                else{
                     int l = 0;
                    if(i+1 < r){
                        if(matrix[i+1][j] == 1) l++;
                    }
                    if(i-1 >=0){
                        if(matrix[i-1][j] == 1)l++;
                    }
                    if(j+1 <c ){
                        if(matrix[i][j+1] == 1) l++;

                    }
                    if(j-1 >=0){
                        if(matrix[i][j-1] ==1 )l++;
                    }
                    if(i+1 <r && j+1 < c){
                        if(matrix[i+1][j+1] ==1)l++;
                    }
                    if(i+1 < r && j-1>=0){
                        if(matrix[i+1][j-1] ==1)l++;
                    }
                    if(i-1 >=0 && j+1<c){
                        if(matrix[i-1][j+1] ==1)l++;
                    }
                    if(i-1 >=0 && j-1 >=0){
                        if(matrix[i-1][j-1] ==1) l++;
                    }
                    
                    if(l<2)copy[i][j] = 0;
                    if(l>3) copy[i][j]  =0;
                }
            }
        }*/


        int dir[][] = {{0,1} ,{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int live = 0;

                for(int pos[] : dir){
                   int  ni = i+ pos[0];
                   int  nj = j+pos[1];

                    if(ni>=0 && ni<r && nj>=0 && nj<c && matrix[ni][nj] ==1){
                        live++;
                    }
                }


                if(matrix[i][j]==1 && (live<2 || live>3)){
                    copy[i][j] = 0;
                }

                if(matrix[i][j] ==0 && live==3){
                    copy[i][j]=1;
                }
            }
        }        
    }
}