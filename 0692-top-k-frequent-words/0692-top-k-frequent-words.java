class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ls = new ArrayList<>();
        TreeMap< String, Integer> mp = new TreeMap<>();
        for(String s : words){
            mp.put(s, mp.getOrDefault(s,0)+1);
        }
        List<Map.Entry<String, Integer>> en = new ArrayList<>(mp.entrySet());
        en.sort((a,b)-> b.getValue() - a.getValue());
        for(int i=0;i<k;i++)
        {
            ls.add(en.get(i).getKey());
        }
        return ls;
    }
}