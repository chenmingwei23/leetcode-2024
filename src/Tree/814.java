class Solution {
    public TreeNode pruneTree(TreeNode root) {
        helper(root);
        if (root.left == null && root.right == null && root.val == 0){
            root = null;
        }
        return root;
    }

    /*
        This function calculates the sum of the subTree, if sum is equal to zero, then remove the subTree
     */
    int helper(TreeNode t) {
        if (t == null) {
            return 0;
        }
        int l = helper(t.left);
        int r = helper(t.right);

        if (l == 0) t.left = null;
        if (r == 0) t.right = null;

        return l + r + t.val;
    }
}