package problem_solving.week8._9;

import java.util.*;

public class t_1 {
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        int n[]={50,20,70,10,30,5,15,25,60,90,62,65,64,35};
        for (int i = 0; i < n.length; i++) tree.add(n[i]);
        System.out.println(tree.search(30));
        System.out.println(tree.search(33));
        System.out.println(tree);
        System.out.println(BinarySearchTree.inorder(tree.root));
    }
}
class BinarySearchTree {
    class BinaryTree {
        int key;
        BinaryTree left, right;

        public BinaryTree(int key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return Integer.toString(key);
        }
    }

    BinaryTree root;

    public void add(int key) {
        root = add(root, key);
    }

    private BinaryTree add(BinaryTree tree, int key) {
        BinaryTree node = tree;
        if (node == null) return new BinaryTree(key);
        else {
            while (true) {
                if (node.key < key) {
                    if (node.right == null) {
                        node.right = new BinaryTree(key);
                        break;
                    } else {
                        node = node.right;
                    }
                }
                else if(node.key > key) {
                    if (node.left == null) {
                        node.left = new BinaryTree(key);
                        break;
                    } else
                        node = node.left;
                }
            }
        }
//        if (tree == null) return new BinaryTree(key);
//        if (tree.key < key) tree.right = add(tree.right, key);
//        else if (tree.key > key) tree.left = add(tree.left, key);
//        else ; // value 삽입 시 else tree.value=value;
        return tree;
    }

    public BinaryTree search(int key) {
//        BinaryTree node = root;
//        while (node != null) {
//            if (node.key == key) return node;
//            if (node.key < key) node = node.right;
//            else node = node.left;
//        }
        return searchRecur(root, key);
//          return node;
    }

    private BinaryTree searchRecur(BinaryTree node, int key) {
        if(node == null)
            return null;
        if (node.key == key)
            return node;
        if (node.key < key)
            return searchRecur(node.right, key);
        else
            return searchRecur(node.left, key);
    }

    @Override
    public String toString() {
        return levelOrder().toString();
    }

//    public static LinkedList<BinaryTree> inorder(BinaryTree root){
//        LinkedList<BinaryTree> list = new LinkedList<>();
//        inOrderTraverse(list, root);
//        return list;
//    }

    private static void inOrderTraverse(LinkedList<BinaryTree> list, BinaryTree root) {
        if (root != null) {
            inOrderTraverse(list, root.left);
            list.add(root);
            inOrderTraverse(list, root.right);
        }
    }

    private LinkedList<BinaryTree> levelOrder() {
        LinkedList<BinaryTree> list = new LinkedList<>();
        LinkedList<BinaryTree> queue = new LinkedList<>();
        if (root != null) queue.addLast(root);
        while (!queue.isEmpty()) {
            BinaryTree node = queue.removeFirst();
            list.add(node);
            if (node.left != null) queue.addLast(node.left);
            if (node.right != null) queue.addLast(node.right);
        }
        return list;
    }

    public static String inorder(BinaryTree tree) {
        if(tree == null) return "";
        return inorder(tree.left) + " " + tree.key + " " + inorder(tree.right);
    }

}
