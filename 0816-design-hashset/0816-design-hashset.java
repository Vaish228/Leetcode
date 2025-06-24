class MyHashSet {
    int size = (int)Math.pow(10,6)+1;
    boolean[] f;
    public MyHashSet() {
        f = new boolean[size];
    }
    
    public void add(int key) {
        f[key] = true;
    }
    
    public void remove(int key) {
        f[key] = false;
    }
    
    public boolean contains(int key) {
        return f[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */