class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int l=0, r=n-1;
        while(r-l>=k)
        {
            if(Math.abs(arr[l]-x)<=Math.abs(arr[r]-x))
                r--;
            else
                l++;    
        }
        List<Integer> li = new ArrayList<>();
        for(int i=l;i<=r;i++){
            li.add(arr[i]);
        }
        return li;
    }
}