class MyHashMap {
    public int size = (int) Math.pow(10,6)+1;
    public int[] arr = new int[size];
    public MyHashMap() {
        for(int i=0;i<size;i++)
            arr[i] = -1;
    }
    
    public void put(int key, int value) {
        arr[key] = value;
     }
    
    public int get(int key) {
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */