
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


class Solution {
    public int maxDepth(Node root) {
        int maxchildDepth=0;
        //List<Node>children=root.children;
        if(root==null)
        {
            return 0;
        }
        for(Node child:root.children)
        {
            int childDepth=maxDepth(child);
            maxchildDepth=Math.max(childDepth,maxchildDepth);
        }
        return maxchildDepth+1;

        
    }
}
