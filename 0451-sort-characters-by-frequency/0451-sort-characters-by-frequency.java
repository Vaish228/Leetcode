class Solution {
    public String frequencySort(String s)  {
        //   int f[] = new int[128];
        //   StringBuilder sb = new StringBuilder();
        //   for(char ch : s.toCharArray()){
        //     f[ch]++;
        //   }

        //   for(int i =0;i<s.length();i++){
        //     int max = f[0];
        //     int maxind = 0;
        //     for(int j =1;j<128;j++){
        //         if(max<f[j]){
        //             max = f[j];
        //             maxind = j;
        //         }
        //     }
        //     for(int k =0;k<max;k++){
        //         sb.append((char)maxind);
        //     }
        //     f[maxind]=0;
        //   }
        //   return sb.toString();
        Map<Character, Integer> mp = new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> em : list){
            char ch = em.getKey();
            int count = em.getValue();
            for(int i=0;i<count;i++){
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}