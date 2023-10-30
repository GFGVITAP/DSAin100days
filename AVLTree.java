class TreeNode {
    int data;
    TreeNode left, right;
    int height;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
        height = 1;
    }
}

class AVLTree {
    TreeNode root;

    AVLTree() {
        root = null;
    }

    int height(TreeNode node) {
        if (node == null)
            return 0;
        return node.height;
    }

    int balanceFactor(TreeNode node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    TreeNode insert(TreeNode root, int data) {
        if (root == null)
            return new TreeNode(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = balanceFactor(root);

        if (balance > 1) {
            if (data < root.left.data) {
                return rightRotate(root);
            } else {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }

        if (balance < -1) {
            if (data > root.right.data) {
                return leftRotate(root);
            } else {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }

        return root;
    }

    TreeNode delete(TreeNode root, int data) {
        // Implement AVL tree deletion logic
        return root;
    }
}

public class Main {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.root = avlTree.insert(avlTree.root, 10);
        avlTree.root = avlTree.insert(avlTree.root, 20);
        avlTree.root = avlTree.insert(avlTree.root, 30);

        // Add more nodes if needed
        // avlTree.root = avlTree.insert(avlTree.root, 40);

        // Delete nodes
        // avlTree.root = avlTree.delete(avlTree.root, 20);
    }
}
