class Solution {
    public List<List<Integer>> generate(int numRows) {
        //int n = numRows.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            int ans = 1;
            List<Integer> l = new ArrayList<>();
            for(int j=1;j<=i;j++){
                l.add(ans);
                ans = ans*(i-j);
                ans/=j;
            }
            res.add(l);
        }
        return res;
    }
}