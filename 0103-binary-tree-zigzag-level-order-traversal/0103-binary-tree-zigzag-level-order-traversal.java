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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if (root==null) return res;
        Deque<TreeNode> q=new LinkedList<>();
        boolean flag=false;
        q.addFirst(root);
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> curlevel=new ArrayList<>();
            for(int i=0;i<levelsize;i++)
            {
                if(!flag){
                    TreeNode node=q.removeFirst();
                    curlevel.add(node.val);
                    if(node.left!=null)q.addLast(node.left);
                    if(node.right!=null)q.addLast(node.right);
                   
                }else{
                    TreeNode node=q.removeLast();
                    curlevel.add(node.val);
                     if(node.right!=null)q.addFirst(node.right);
                    if(node.left!=null)q.addFirst(node.left);
                    
                }
            }
            res.add(curlevel);
            flag=!flag;

        }
        return res;
    }
}