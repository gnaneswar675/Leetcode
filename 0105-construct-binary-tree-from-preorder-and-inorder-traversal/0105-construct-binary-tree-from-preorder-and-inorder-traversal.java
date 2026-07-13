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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=buildtree(map,preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;
    }
    public TreeNode buildtree(Map<Integer,Integer> map,int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend){
        if(prestart>preend || instart>inend)
            return null;

        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=map.get(root.val);
        int left=inroot-instart;
        root.left=buildtree(map,preorder,prestart+1,prestart+left,inorder,instart,inroot-1);
        root.right=buildtree(map,preorder,prestart+left+1,preend,inorder,inroot+1,inend);
        return root;
    }
}