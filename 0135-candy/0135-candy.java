class Solution {
    public int candy(int[] ra) {
         int n = ra.length;

         int[] ca = new int[n];
         Arrays.fill(ca, 1);
         for(int i=1; i<n;i++)
         {
            if(ra[i]>ra[i-1])
            {
                ca[i] = ca[i-1]+1;
            }
         }   
         for(int i=n-2;i>=0;i--)
         {
            if(ra[i]>ra[i+1])
            {
                //ca[i]=ca[i+1]+1;
                ca[i]=Math.max(ca[i],ca[i+1]+1);
            }
         }
         int t=0;
         for(int c : ca)
         {
            t+=c;
         }
         return t;

    }
}