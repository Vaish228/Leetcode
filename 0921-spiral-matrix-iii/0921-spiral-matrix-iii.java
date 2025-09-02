class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List<int []> res = new ArrayList<>();

        int r =  rStart;
        int c = cStart;

        int tot = rows*cols;

        int dir[][] = {{0,1} , {1,0} ,{0,-1} ,{-1,0}};
        int d = 0;
        int numSteps  =1;
        while(res.size() < tot){
           for(int i=0;i<2;i++){
            for(int j=0;j<numSteps;j++){

                if( 0<= r && r<rows && 0<=c && c<cols)
                   res.add(new int[]{r,c});

                if(res.size()== tot){
                    return convert(res);
                }

                r += dir[d][0];
                c+= dir[d][1];
            }
            d = (d+1)%4;
           }
           numSteps++;
        }

        return convert(res);
    }

    public static int[][] convert(List<int []> res){
        int arr[][] = new int[res.size()][2];

        for(int i=0;i<res.size();i++){
            arr[i] = res.get(i);
        }
        return arr;        
    }
}