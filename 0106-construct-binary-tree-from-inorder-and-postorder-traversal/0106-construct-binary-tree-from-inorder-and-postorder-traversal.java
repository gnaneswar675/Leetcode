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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer>inmap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        return traverse(inmap,inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode traverse(Map<Integer,Integer> inmap,int inorder[],int instart,int inend,int[] postorder,int poststart,int postend){
        if(instart > inend || poststart > postend)
            return null;
        TreeNode root=new TreeNode(postorder[postend]);
        int rootpos=inmap.get(root.val);
        int numsleft = rootpos - instart;
        root.left=traverse(inmap,inorder,instart,rootpos-1,postorder,poststart,poststart + numsleft - 1);
        root.right=traverse(inmap,inorder,rootpos+1,inend,postorder,poststart+numsleft,postend-1);
        return root;
    }
}