/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Tuple{
    TreeNode node;int level,ver;
    public Tuple(TreeNode nnode,int vver,int llevel){
        node=nnode;
        level=llevel;
        ver=vver;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if (root==null)return res;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple>q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty())
        {
            Tuple temp=q.poll();
            TreeNode node=temp.node;
            int ver=temp.ver;
            int level=temp.level;

            if(!map.containsKey(ver)){
                map.put(ver,new TreeMap<>());
            }
            if(!map.get(ver).containsKey(level)){
                map.get(ver).put(level,new PriorityQueue<>());
            }
            map.get(ver).get(level).add(node.val);
            if(node.left!=null){
                q.offer(new Tuple(node.left,ver-1,level+1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right,ver+1,level+1));
            }

        }
        for (TreeMap<Integer,PriorityQueue<Integer>>levels:map.values()) {
            List<Integer>col=new ArrayList<>();
            for (PriorityQueue<Integer>pq:levels.values()) {
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            res.add(col);
        }
        return res;

    }
}