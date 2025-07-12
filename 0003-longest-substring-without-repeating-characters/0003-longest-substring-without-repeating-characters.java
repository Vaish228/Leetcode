class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        //int ans = Integer.MIN_VALUE;
        if(s.isEmpty()) return 0;
        int max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int l=0,r=0,i=0,j=0;
        while(r<n){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r)); 
            max = Math.max(max, set.size());
            r++;
        }
        return max;
    }
}