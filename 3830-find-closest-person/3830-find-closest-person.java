class Solution {
    public int findClosest(int x, int y, int z) {
        int a = 1;
        int b = 2;
        if(Math.abs(x-z)==Math.abs(y-z))
            return 0;
        else{    
            int c = Math.abs(x-z) < Math.abs(y-z) ? a : b;
            return c;
        }    
    }
}