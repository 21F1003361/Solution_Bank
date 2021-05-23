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
/*class Solution {
    private boolean flag;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        System.out.println(root.val);
        if(root==null) return false;
        if(helper(root,subRoot)) return true;
        else{
            return helper(root.left,subRoot) || helper(root.right,subRoot);
        }
        
    }
    
    private static boolean helper(TreeNode root, TreeNode subRoot){
        
        
        if(root==null && subRoot==null) {
            
            return true;
        }
        if(root==null || subRoot==null) return false;
        
        if(root.val!=subRoot.val) return false;
        else
            return helper(root.left,subRoot.left) && helper(root.right,subRoot.right);
        
    }
}*/

class Solution {
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root==null) return false;
        
        if(issame(root,subRoot)) return true;
        
        return(issame(root.left,subRoot) || issame(root.right,subRoot));
    }
    
    private static boolean issame(TreeNode root, TreeNode subRoot){
        
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        
        if(root.val!=subRoot.val) return false;
        
        return issame(root.left,subRoot.left) && issame(root.right,subRoot.right);
        
        
    }
    
    
}
x1

public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        
        if (s.val != t.val) return false;
        
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}

