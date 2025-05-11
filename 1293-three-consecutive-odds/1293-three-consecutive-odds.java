class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c =0;
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
                c=1;
        }
        if(c>0)
            return true;
        else
            return false;    
        
    }
}