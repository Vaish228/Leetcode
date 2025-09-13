class Solution {
    public String sortVowels(String s) {
        // int[] freq = new int[128];
        // boolean[] isVowel = new boolean[128];
        // String vowels = "aeiouAEIOU";
        // for (char v : vowels.toCharArray()) {
        //     isVowel[v] = true;
        // }
        // for (char c : s.toCharArray()) {
        //     if (isVowel[c]) {
        //         freq[c]++;
        //     }
        // }
        // String order = "AEIOUaeiou";
        // int pos = 0;
        // char[] arr = s.toCharArray();
        // for (int i = 0; i < arr.length; i++) {
        //     if (isVowel[arr[i]]) {
        //         while (pos < order.length() && freq[order.charAt(pos)] == 0) {
        //             pos++;
        //         }
        //         arr[i] = order.charAt(pos);
        //         freq[order.charAt(pos)]--;
        //     }
        // }
        // return new String(arr);      

        int n = s.length();
        List<Character> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                l.add(ch);
            }
        }

        Collections.sort(l);
        int x = 0;
        for(int i=0;i<n;i++){
           char ch = s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                sb.append(l.get(x++));
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
  
    }
}