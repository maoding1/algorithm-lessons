package recursion;

import recursion.utils.TreeNode;

public class InvertTree {
    /* leetcode 翻转二叉树*/
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
