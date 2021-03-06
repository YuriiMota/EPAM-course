package com.mota;



public class TreeMap {
    private Node root;

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null)
                return null;
        }
        return current;
    }

    public void put(int id, double dd) {
        Node newNode = new Node(); // make new node
        newNode.iData = id; // insert data
        newNode.dData = dd;
        if (root == null) { // no node in root
            root = newNode;
        }
        else // root occupied
        {
            Node current = root; // start at root
            Node parent;
            while (true) // (exits internally)
            {
                parent = current;
                if (id < current.iData) // go left?
                {
                    current = current.leftChild;
                    if (current == null) // if end of the line,
                    { // insert on left
                        parent.leftChild = newNode;
                        return;
                    }
                } // end if go left
                else // or go right?
                {
                    current = current.rightChild;
                    if (current == null) // if end of the line
                    { // insert on right
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    public boolean delete(int key) // delete node with given key
    { // (assumes non-empty list)
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.iData != key) // search for node
        {
            parent = current;
            if (key < current.iData) // go left?
            {
                isLeftChild = true;
                current = current.leftChild;
            } else // or go right?
            {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) // end of the line,
                return false; // didn’t find it
        } // end while
// found node to delete
// if no children, simply delete it
        if (current.leftChild == null &&
                current.rightChild == null) {
            if (current == root) // if root,
                root = null; // tree is empty
            else if (isLeftChild)
                parent.leftChild = null; // disconnect
            else // from parent
                parent.rightChild = null;
        }
// if no right child, replace with left subtree
        else if (current.rightChild == null)
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
// if no left child, replace with right subtree
        else if (current.leftChild == null)
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        else // two children, so replace with inorder successor
        {
// get successor of node to delete (current)
            Node successor = getSuccessor(current);
// connect parent of current to successor instead
            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;
// connect successor to current’s left child
            successor.leftChild = current.leftChild;
        } // end else two children
// (successor cannot have a left child)

        return true; // success
    } // end delete()

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild; // go to right child
        while (current != null) // until no more
        { // left children,
            successorParent = successor;
            successor = current;
            current = current.leftChild; // go to left child
        }
// if successor not
        if (successor != delNode.rightChild) // right child,
        { // make connections
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }




public static void main(String[]args){
        TreeMap treeMap=new TreeMap();
        treeMap.put(1,23);
        treeMap.put(3,24.2);
        treeMap.put(9,12);
        treeMap.put(2,313.2);
        treeMap.put(7,18.9);
        treeMap.toString();

        }
        }
