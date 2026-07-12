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
class Pair{
    TreeNode node;long idx;
    Pair(TreeNode node,long idx){
        this.node=node;this.idx=idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int res=0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int n=q.size();
            long minn=q.peek().idx;
            long first=0,last=0;
            for(int i=0;i<n;i++){
                Pair cur=q.poll();
                long idx=cur.idx-minn;
                TreeNode nnode=cur.node;
                if(i==0)first=idx;
                if(i==n-1)last=idx;

                if(nnode.left!=null)
                    q.add(new Pair(nnode.left,2*idx+1));
                if(nnode.right!=null)
                    q.add(new Pair(nnode.right,2*idx+2));

            }
            int width=(int)(last-first+1);
            res=Math.max(res,width);
        }
        return res;
    }
}