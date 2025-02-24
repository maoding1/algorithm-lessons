package recursion;

import recursion.utils.TreeNode;

public class CalculateTreeDepth {
    public int calculateDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(calculateDepth(root.left), calculateDepth(root.right)) + 1;
    }

}
