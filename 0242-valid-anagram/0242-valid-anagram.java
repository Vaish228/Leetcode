class Solution {
    public boolean isAnagram(String s, String t) {
        // int a[] = new int[26];
        // for( char ch : s.toCharArray())
        // {
        //     a[ch-'a']++;
        // }
        // for(char ch : t.toCharArray())
        // {
        //     a[ch-'a']--;
        // }
        // for(int count : a){
        //     if(count!=0)
        //         return false;
        // }  
        // return true; 


        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch :s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(char ch :t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        
        
        for(var pair:map.entrySet()){
            if(pair.getValue()!=0)
                return false;
        }
        
        return true; 
    }
}