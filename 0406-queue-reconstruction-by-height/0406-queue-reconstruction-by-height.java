class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0]; 
            } else {
                return a[1] - b[1]; 
            }
        });
        
        List<int[]> queue = new ArrayList<>();
        for (int[] person : people) {
            queue.add(person[1], person); 
        }
        
        return queue.toArray(new int[queue.size()][]); 
    }
}