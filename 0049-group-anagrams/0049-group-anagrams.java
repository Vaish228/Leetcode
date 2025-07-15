class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> mp = new HashMap<>();
      for(String s : strs){
        char c[] = s.toCharArray();
        Arrays.sort(c);
        String ab = new String(c);
        mp.computeIfAbsent(ab,k->new ArrayList<>()).add(s);
      }
      return new ArrayList<>(mp.values());
    }
} 