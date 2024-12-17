package Experience.Tutorials.Concepts.DSA.DataStructures;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    List<TreeNode> children;

    public TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class GeneralTreeExample {
    public static void main(String[] args) {
        // Theoretical Explanation: A general tree is a hierarchical data structure where each node can have multiple children.
        
        // Contextual Explanation: Let's create a general tree representing a family tree.
        TreeNode grandparent = new TreeNode(1);
        TreeNode parent1 = new TreeNode(2);
        TreeNode parent2 = new TreeNode(3);
        
        grandparent.children.add(parent1);
        grandparent.children.add(parent2);
        
        // Displaying the family tree structure
        System.out.println("Family Tree Structure:");
        System.out.println("Grandparent: " + grandparent.val);
        System.out.println("  |");
        System.out.println("Children:");
        for (TreeNode child : grandparent.children) {
            System.out.println("  |__ " + child.val);
        }
    }
}