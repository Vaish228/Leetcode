class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int c =0;
        int n = arr.length;
        for(int i=0;i+m<n;i++){
            c = arr[i]==arr[i+m] ? c+1 : 0;
            if(c==(k-1)*m)
                return true;
        }
        return false;
    }
}