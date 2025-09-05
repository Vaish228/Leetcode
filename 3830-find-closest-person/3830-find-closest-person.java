class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(z-x);
        int b = Math.abs(z-y);
        
         
         System.out.println(a+" "+b);

        if(a==b) return 0;
        else if(a>b) return 2;
        else return 1;
    }
}