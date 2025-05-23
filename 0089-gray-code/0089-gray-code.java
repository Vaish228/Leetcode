class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rs = new ArrayList<Integer>();
        // rs.add(0);
        // for(int i=0;i<n;i++)
        // {
        //     int size = rs.size();
        //     for(int j = size-1;j>=0;j--)
        //     {
        //         rs.add(rs.get(j)|1<<i);
        //     }
        // }
        int totalNumbers = 1<<n; 

        for (int i = 0; i < totalNumbers; i++) {
            rs.add(i ^ (i >> 1)); 
        }

        return rs;
    }
}