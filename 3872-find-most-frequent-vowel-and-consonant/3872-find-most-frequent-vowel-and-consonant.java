class Solution {
    public int maxFreqSum(String s) {
        int freq[] = new int[128];
        for(char c : s.toCharArray()){
            //if(c)
            freq[c]++;
        }
        int mv =0, mc =0;
        for(int i=0;i<128;i++){
           // if(freq[i]>0){
            char c = (char)i;
            if(isVowel(c))
                mv = Math.max(mv,freq[i]);
            else
                mc = Math.max(mc,freq[i]);    
       // }
        }
        return mv+mc;

    }
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}