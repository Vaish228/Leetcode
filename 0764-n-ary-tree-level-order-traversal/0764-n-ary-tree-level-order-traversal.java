/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> l = new ArrayList<>();
        func(root, 0, l);
        return l;
    }

    public void func(Node root, int level, List<List<Integer>> l) {
        if (root == null) return;

        if (l.size() == level) {
            l.add(new ArrayList<>());
        }

        l.get(level).add(root.val);

        for (Node child : root.children) {
            func(child, level + 1, l);
        }
    }
}
