class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0;
        Map<Integer, Integer> mp = new HashMap<>();
        int n = fruits.length;
        int ml=0;
        while(r<n){
            int ff=fruits[r];
            mp.put(ff,mp.getOrDefault(ff,0)+1);

            while(mp.size()>2){
                int lf = fruits[l];
                mp.put(lf,mp.get(lf)-1);
                if (mp.get(lf) == 0) {
                    mp.remove(lf);
                }
                l++;
            }
            ml = Math.max(ml,r-l+1);
            r++;
        }
        return ml;
    }
}