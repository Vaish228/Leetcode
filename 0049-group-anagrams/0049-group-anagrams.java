class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[]c = s.toCharArray();
            Arrays.sort(c);
            String st = new String(c);
            mp.computeIfAbsent(st, k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}