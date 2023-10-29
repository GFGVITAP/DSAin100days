class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    BinaryTree() {
        root = null;
    }

    int findLevel(TreeNode node, int key, int level) {
        if (node == null)
            return -1; // Node not found
        if (node.data == key)
            return level;

        int leftLevel = findLevel(node.left, key, level + 1);
        if (leftLevel != -1)
            return leftLevel;

        int rightLevel = findLevel(node.right, key, level + 1);
        return rightLevel;
    }

    int getLevel(int key) {
        return findLevel(root, key, 0);
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        int key = 5;
        int level = tree.getLevel(key);

        if (level != -1) {
            System.out.println("Level of node with data " + key + " is: " + level);
        } else {
            System.out.println("Node with data " + key + " not found in the tree.");
        }
    }
}
