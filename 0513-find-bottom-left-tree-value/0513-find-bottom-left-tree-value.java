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
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root==null)return 0;
        List<List<Integer>>tree=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelsize=q.size();            
            List<Integer> cur=new ArrayList<>();            
            for(int i=0;i<levelsize;i++){
                TreeNode node=q.poll();
                cur.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            tree.add(cur);
        }
        List <Integer> temp=tree.get(tree.size()-1);
        return temp.get(0);
    }
}