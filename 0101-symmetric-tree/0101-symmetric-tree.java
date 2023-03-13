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
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null)
            return true;
        
         return helper(root.left,root.right);
    }
    
    
    public boolean helper(TreeNode leftSubRoot,TreeNode rightSubRoot)
    {
     if(leftSubRoot==null && rightSubRoot ==null)
         return true;
    
     if(leftSubRoot==null || rightSubRoot ==null)   
        return false;
    
    if(leftSubRoot.val!=rightSubRoot.val)
        return false;
        
    return helper(leftSubRoot.left,rightSubRoot.right) &&helper(leftSubRoot.right,rightSubRoot.left);
        
    }
}