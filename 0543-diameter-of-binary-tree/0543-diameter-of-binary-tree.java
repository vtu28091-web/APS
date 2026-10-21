class Solution {
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return d;
    }
    int height (TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        d=Math.max(d, l+r);
        return 1+Math.max(l,r);
    }
}