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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        if (root==null)return res;
        List<List<Double>> tree=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Double> curlevel=new ArrayList<>();
            
            for(int i=0;i<levelsize;i++){
                TreeNode node=q.poll();
                curlevel.add((double)node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            tree.add(curlevel);
        }
        for(int i=0;i<tree.size();i++){
            double sum=0;
            for(Double temp:tree.get(i)){
                sum+=temp;
            }
            res.add(sum/tree.get(i).size());
        }
        return res;
    }
}