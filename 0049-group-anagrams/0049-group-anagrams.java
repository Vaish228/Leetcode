class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String k = String.valueOf(c);
            mp.computeIfAbsent(k, i-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}