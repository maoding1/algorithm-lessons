package recursion.utils;
import java.util.LinkedList;
import java.util.Queue;

 public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
     public void printTree() {
         int height = getHeight(this);
         int maxWidth = (int) Math.pow(2, height) - 1;

         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(this);

         for (int i = 0; i < height; i++) {
             int levelNodes = (int) Math.pow(2, i);
             int spaces = (maxWidth / levelNodes) / 2;

             // 打印前置空格
             printSpaces(spaces);

             for (int j = 0; j < levelNodes; j++) {
                 if (!queue.isEmpty()) {
                     TreeNode node = queue.poll();
                     if (node != null) {
                         System.out.print(node.val);
                         queue.add(node.left);
                         queue.add(node.right);
                     } else {
                         System.out.print(" ");
                         queue.add(null);
                         queue.add(null);
                     }
                 }
                 if (j < levelNodes - 1) {
                     printSpaces(spaces);
                 }
             }
             System.out.println();
         }
     }

     private void printSpaces(int count) {
         for (int i = 0; i < count; i++) {
             System.out.print(" ");
         }
     }

     private int getHeight(TreeNode node) {
         if (node == null) {
             return 0;
         }
         return 1 + Math.max(getHeight(node.left), getHeight(node.right));
     }

     public static void main(String[] args) {
         // 示例树:
         //      1
         //     / \
         //    2   3
         //   / \
         //  4   5

         TreeNode root = new TreeNode(1,
                 new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                 new TreeNode(3));
         root.printTree();
     }
 }