package Experience.Tutorials.Concepts.DSA.DataStructures;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeExample {
    public static void main(String[] args) {
        // Theoretical Explanation: Binary Tree is a hierarchical data structure where each node has at most two children.
        
        // Contextual Explanation: Let's create a simple binary tree with integer values.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        // Displaying the binary tree structure
        System.out.println("Binary Tree Structure:");
        System.out.println("   " + root.val);
        System.out.println(" /   \\");
        System.out.println(root.left.val + "     " + root.right.val);
    }
}