class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> st = new HashSet<>();
        for(char c : brokenLetters.toCharArray()){
            st.add(c);
        }
        String[] words = text.split(" ");
        int count = 0;

        for (String word : words) {
            boolean canType = true;
            for (char ch : word.toCharArray()) {
                if (st.contains(ch)) {  
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }

        return count;
    }
}