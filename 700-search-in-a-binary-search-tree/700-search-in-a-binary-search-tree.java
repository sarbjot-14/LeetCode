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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode searchedNode = recursiveSearch(root, val);
        
        return searchedNode;
        
    }
    
    public TreeNode recursiveSearch(TreeNode node, int val){
        
        // base case
        if(node == null){
            return null;
        }
        else if(node.val == val){
            return node;
        }
        else{
            TreeNode left = recursiveSearch(node.left, val);
            TreeNode right = recursiveSearch (node.right, val);
            if(left != null){
                return left;
            }
            else if(right != null){
                return right;
            }
            else{
                return null;
            }
        }
    
    }
}