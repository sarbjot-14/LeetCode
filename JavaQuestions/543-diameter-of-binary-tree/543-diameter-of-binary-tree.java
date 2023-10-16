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
   public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
       int dia = depth(root.left) + depth(root.right);
       int ldia = diameterOfBinaryTree(root.left);
       int rdia = diameterOfBinaryTree(root.right);
       return Math.max(dia,Math.max(ldia,rdia));
        
    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(depth(root.left), depth(root.right));
    }
}