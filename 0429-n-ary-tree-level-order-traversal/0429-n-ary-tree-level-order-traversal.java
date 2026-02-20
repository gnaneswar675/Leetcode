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
        List<List<Integer>> res=new ArrayList<>();
        if (root==null)return res;
        Queue <Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<levelsize;i++)
            {
                Node node=queue.poll();
                temp.add(node.val);
                int n=node.children.size();
                for(int j=0;j<n;j++)
                {
                    if(node.children.get(j)!=null)
                        queue.add(node.children.get(j));
                }

            }
            res.add(temp);
        }
        return res;
    }
}