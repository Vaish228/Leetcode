class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String,Integer> map = new HashMap<>();
        int c =0;
        for(int[] d : dominoes)
        {
            Arrays.sort(d);
            String k = d[0]+","+d[1];
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(int f : map.values())
        {
            c+= f*(f-1) / 2;
        }
        return c;
    }
}