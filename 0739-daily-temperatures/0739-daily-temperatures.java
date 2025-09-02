class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] tot = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                int an = st.pop();
                tot[an] = i-an;
            }
            st.push(i);
        }
        return tot;
    }
}