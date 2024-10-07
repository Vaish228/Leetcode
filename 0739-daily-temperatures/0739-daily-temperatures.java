class Solution {
    public int[] dailyTemperatures(int[] t) {
    Stack<Integer> st = new Stack<>();
    int [] an = new int[t.length];
    for(int i=0;i<t.length;i++)
    {
        while(!st.isEmpty() && t[i] > t[st.peek()])
        {
            int nd= st.pop();
            an[nd] = i-nd;
        }
        st.push(i);
    }
    return an;
    }
}