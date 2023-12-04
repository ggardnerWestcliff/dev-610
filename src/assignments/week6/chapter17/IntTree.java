package assignments.week6.chapter17;

/*
--Exercise 1--
Write a method called countLeftNodes that returns the number of left children in the tree. A left child is a node that
appears as the root of the left-hand subtree of another node. For example, reference tree #1 has 3 left children (the
nodes storing the values 5, 1, and 4).

--Exercise 2--
Write a method called countEmpty that returns the number of empty branches in a tree. An empty tree is considered to
have one empty branch (the tree itself). For nonempty trees, your methods should count the total number of empty
branches among the nodes of the tree. A leaf node has two empty branches, a node with one nonempty child has one empty
branch, and a node with two nonempty children has no empty branches. For example, reference tree #1 has 7 empty branches
(two under the value 1, one under 5, and two under each of 4 and 6).

--Exercise 3--
Write a method called depthSum that returns the sum of the values stored in a binary tree of integers weighted by the
depth of each value. The method should return the value at the root, plus 2 times the values stored at the next level of
the tree, plus 3 times the values stored at the next level of the tree, and so on. For example, the depth sum of
reference tree #1 would be computed as (1 * 3) + (2 * (5 + 2)) + (3 * (1 + 4 + 6)) = 50.

--Exercise 4--
Write a method called countEvenBranches that returns the number of branch nodes in a binary tree that contain even
numbers. A branch node has one or two children (i.e., it is not a leaf). For example, if a variable t refers to
reference tree #2, then the call t.countEvenBranches() should return 3 because there are three branch nodes with even
values (2, 8, and 6). Notice that leaf nodes with even values are not included (the nodes storing 0 and 4).

--Exercise 5--
Write a method called printLevel that accepts an integer parameter n and prints the values at level n from left to
right, one per line. We will use the convention that the overall root is at level 1, its children are at level 2, and
so on. If there are no values at the level, your method should produce no output. Your method should throw an
IllegalArgumentException if it is passed a value for a level that is less than 1. For example, if a variable t refers
to reference tree #2, then the call of t.printLevel(3); would produce the following output:
0
7
6

--Exercise 6--
Write a method called printLeaves that prints to System.out the leaves of a binary tree from right to left. More
specifically, the leaves should be printed in the reverse order that they would be printed using any of the standard
traversals. If the tree is empty, your method should produce the output "no leaves". For example, if a variable t refers
to reference tree #2, the call of t.printLeaves(); should produce the following output:
leaves: 9 4 0

--Exercise 7--
Write a method called isFull that returns true if a binary tree is full and false if it is not. A full binary tree is
one in which every node has 0 or 2 children. For example, reference trees #1 and #2 are not full, but #3 is full. By
definition, the empty tree is considered full.

--Exercise 8--
Write a toString method for a binary tree of integers. The method should return "empty" for an empty tree. For a leaf
node, it should return the data in the node as a string. For a branch node, it should return a parenthesized String that
has three elements separated by commas: the data at the root, a string representation of the left subtree, and then a
string representation of the right subtree. For example, if a variable t refers to reference tree #2, then the call
t.toString() should return the following String (without the surrounding quotes):
"(2, (8, 0, empty), (1, (7, 4, empty), (6, empty, 9)))"

--Exercise 9--
Write a method called equals that accepts another binary tree of integers as a parameter and compares the two trees to
see whether they are equal to each other. For example, if variables of type IntTree called t1 and t2 have been
initialized, then t1.equals(t2) will return true if the trees are equal and false otherwise. Two empty trees are
considered to be equal to each other.

--Exercise 10--
Write a method called doublePositives that doubles all data values greater than 0 in a binary tree of integers.

--Exercise 11--
Write a method called numberNodes that changes the data stored in a binary tree, assigning sequential integers starting
with 1 to each node so that a preorder traversal will produce the numbers in order (1, 2, 3, etc.). For example, if a
variable t refers to reference tree #1, the call of t.numberNodes(); would overwrite the existing data, assigning values
from 1 to 6 to the nodes so that a preorder traversal of the tree would produce 1, 2, 3, 4, 5, 6 as shown in the
following diagram. Do not change the structure of the tree, only the values stored in the data fields.
Your method should return the number of nodes in the tree.

--Exercise 12--
Write a method called removeLeaves that removes the leaves from a tree. A leaf is a node that has empty left and right
subtrees. If your method is called on an empty tree, the method does not change the tree because there are no nodes of
any kind (leaf or not).

--Exercise 13--
Write a method called copy that returns a reference to a new IntTree that is an independent copy of the original tree.
Do not change the original tree.

--Exercise 14--
Write a method called completeToLevel that accepts an integer n as a parameter and that adds nodes to a tree to complete
the first n levels. A level is complete if every possible node at that level is not null. We will use the convention
that the overall root is at level 1, its children are at level 2, and so on. You should preserve any existing nodes in
the tree. Any new nodes added to the tree should contain the value –1. Your method should throw an
IllegalArgumentException if it is passed a value for a level that is less than 1.

--Exercise 15--
Write a method called trim that accepts minimum and maximum integers as parameters and removes from the tree any
elements that are not within that range inclusive. For this method you should assume that your tree is a binary search
tree and that its elements are in valid binary search tree order. Your method should maintain the binary search tree
ordering property of the tree. This property is important for solving this problem.

--Exercise 16--
Write a method called tighten that eliminates branch nodes that have only one child. Each such node should be replaced
by its only child. (This can lead to multiple replacements because the child might itself be replaced.)

--Exercise 17--
Write a method called combineWith that accepts another binary tree of integers as a parameter and combines the two trees
into a new third tree that is returned. The new tree’s structure should be a union of the structures of the two original
trees; it should have a node in any location where there was a node in either of the original trees (or both). The nodes
of the new tree should store an integer indicating which of the original trees had a node at that position (1 if just
the first tree had the node, 2 if just the second tree had the node, and 3 if both trees had the node). Your method
should not change the structure or contents of either of the two original trees that are being combined.

--Exercise 18--
Write a method called inOrderList that returns a list containing the sequence of values obtained from an inorder
traversal of your binary tree of integers. For example, if a variable t refers to reference tree #3, then the call
t.inOrderList() should return the list [8, 3, 7, 2, 1]. If the tree is empty, your method should return an empty list.

--Exercise 19--
Write a method called evenLevels that makes sure that all branches end on an even level. If a leaf node is on an odd
level it should be removed from the tree. We will define the root as being on level 1.

--Exercise 20--
Write a method called makePerfect that adds nodes until the binary tree is a perfect tree. A perfect binary tree is one
where all leaves are at the same level. Another way of thinking of it is that you are adding dummy nodes to the tree
until every path from the root to a leaf is the same length. A perfect tree’s shape is exactly triangular and every
branch node has exactly two children, and all of the leaves are at the same level. Each new node you add to the tree
should store the value 0.

--Exercise 21--
Write a method called matches that returns a count of the number of nodes in one tree that match nodes in another tree.
A match is defined as a pair of nodes that are in the same position in the two trees relative to their overall root and
that store the same data.
*/

import java.util.*;


public class IntTree {
    private IntTreeNode overallRoot;

    // pre : max > 0
    // post: constructs a sequential tree with given number of
    //       nodes
    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    // post: returns a sequential tree with n as its root unless
    //       n is greater than max, in which case it returns an
    //       empty tree
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
        }
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    public int countLeaves() {
        return countLeaves(overallRoot);
    }

    private int countLeaves(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return countLeaves(root.left) + countLeaves(root.right);
        }
    }

    // post: prints the tree contents using a preorder traversal
    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // post: prints the tree contents using a inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an
    //       inorder traversal and using indentation to indicate
    //       node depth; prints right to left so that it looks
    //       correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given
    //       root, indenting each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }

    // post: returns the number of left children in the tree.
    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    }

    private int countLeftNodes(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left != null) {
            return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);
        } else {
            return countLeftNodes(root.right);
        }
    }

    public int countEmpty() {
        return countEmpty(overallRoot);
    }

    private int countEmpty(IntTreeNode root) {
        if (root == null) {
            return 1;
        }
        return countEmpty(root.left) + countEmpty(root.right);
    }

    public int depthSum() {
        return depthSum(overallRoot, 1);
    }

    private int depthSum(IntTreeNode root, int depth) {
        if (root == null) {
            return 0;
        } else {
            return root.data * depth + depthSum(root.left, depth + 1) + depthSum(root.right, depth + 1);
        }
    }

    public int countEvenBranches() {
        return countEvenBranches(overallRoot);
    }

    private int countEvenBranches(IntTreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        if (root.data % 2 == 0) {
            return 1 + countEvenBranches(root.left) + countEvenBranches(root.right);
        } else {
            return countEvenBranches(root.left) + countEvenBranches(root.right);
        }
    }

    public void printLevel(int level) {
        if (level <= 0) {
            throw new IllegalArgumentException();
        } else {
            printLevel(overallRoot, level, 1);
        }
    }

    private void printLevel(IntTreeNode root, int level, int depth) {
        if (root != null) {
            if (level == depth) {
                System.out.println(root.data);
            } else if (level > depth) {
                printLevel(root.left, level, depth + 1);
                printLevel(root.right, level, depth + 1);
            }
        }
    }

    public void printLeaves() {
        if (overallRoot == null) {
            System.out.println("no leaves");
        } else {
            System.out.print("leaves:");
            printLeaves(overallRoot);
        }
    }

    private void printLeaves(IntTreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.print(" " + root.data);
            } else {
                printLeaves(root.right);
                printLeaves(root.left);
            }
        }
    }

    public boolean isFull() {
        return isFull(overallRoot);
    }

    private boolean isFull(IntTreeNode root) {
        if (root == null) {
            return true;
        } else if (root.left == null && root.right != null) {
            return false;
        } else if (root.right == null && root.left != null) {
            return false;
        } else {
            return isFull(root.left) && isFull(root.right);
        }
    }

    public String toString() {
        return toString(overallRoot);
    }

    private String toString(IntTreeNode root) {
        if (root == null) {
            return "empty";
        } else if (root.left == null && root.right == null) {
            return "" + root.data;
        } else {
            return "(" + root.data + ", " + toString(root.left) + ", " + toString(root.right) + ")";
        }
    }

    public boolean equals(IntTree tree) {
        return equals(overallRoot, tree.overallRoot);
    }

    private boolean equals(IntTreeNode node1, IntTreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.data != node2.data) {
            return false;
        }
        return equals(node1.left, node2.left) && equals(node1.right, node2.right);
    }

    public void doublePositives() {
        doublePositives(overallRoot);
    }

    private void doublePositives(IntTreeNode root) {
        if (root != null) {
            int val = root.data;
            if (val > 0) {
                root.data = 2 * val;
            }
            doublePositives(root.left);
            doublePositives(root.right);
        }
    }

    public int numberNodes() {
        return numberNodes(overallRoot, 1);
    }

    private int numberNodes(IntTreeNode root, int counter) {
        if (root == null) {
            return 0;
        } else {
            root.data = counter;
            int leftCount = numberNodes(root.left, counter + 1);
            int rightCount = numberNodes(root.right, counter + leftCount + 1);
            return 1 + leftCount + rightCount;
        }
    }

    public void removeLeaves() {
        overallRoot = removeLeaves(overallRoot);
    }

    private IntTreeNode removeLeaves(IntTreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return null;
        } else {
            root.left = removeLeaves(root.left);
            root.right = removeLeaves(root.right);
            return root;
        }
    }

    public IntTree copy() {
        IntTree newIntTree = new IntTree(1);
        copy(overallRoot, newIntTree.overallRoot);
        return newIntTree;
    }

    private void copy(IntTreeNode root, IntTreeNode copyRoot) {
        if (root == null) {
            copyRoot = null;
        } else {
            copyRoot.data = root.data;
            copyRoot.left = root.left;
            copyRoot.right = root.right;
            copy(root.left, copyRoot.left);
            copy(root.right, copyRoot.right);
        }
    }

    public void completeToLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException();
        } else {
            overallRoot = completeToLevel(overallRoot, level);
        }
    }

    private IntTreeNode completeToLevel(IntTreeNode root, int level) {
        if (root == null) {
            root = new IntTreeNode(-1);
        }
        if (level == 1) {
            return root;
        }
        root.left = completeToLevel(root.left, level - 1);
        root.right = completeToLevel(root.right, level - 1);
        return root;
    }

    public void trim(int min, int max) {
        overallRoot = trim(overallRoot, min, max);
    }

    private IntTreeNode trim(IntTreeNode root, int min, int max) {
        if (root == null) {
            return null;
        }
        if (root.data < min) {
            return trim(root.right, min, max);
        }
        if (root.data > max) {
            return trim(root.left, min, max);
        }
        root.left  = trim(root.left, min, max);
        root.right = trim(root.right, min, max);
        return root;
    }

    public void tighten() {
        overallRoot = tighten(overallRoot);
    }

    private IntTreeNode tighten(IntTreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right != null) {
            return tighten(root.right);
        }
        if (root.left != null && root.right == null) {
            return tighten(root.left);
        }
        root.left = tighten(root.left);
        root.right = tighten(root.right);
        return root;
    }

    public IntTree combineWith(IntTree t2) {
        IntTree t3 = new IntTree(1);
        t3.overallRoot = combineWith(overallRoot, t2.overallRoot);
        return t3;
    }

    private IntTreeNode combineWith(IntTreeNode root1, IntTreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null) {
            IntTreeNode node = new IntTreeNode(2);
            node.left = combineWith(null, root2.left);
            node.right = combineWith(null, root2.right);
            return node;
        }
        if (root2 == null) {
            IntTreeNode node = new IntTreeNode(1);
            node.left = combineWith(root1.left, null);
            node.right = combineWith(root1.right, null);
            return node;
        }
        IntTreeNode node = new IntTreeNode(3);
        node.left = combineWith(root1.left, root2.left);
        node.right = combineWith(root1.right, root2.right);
        return node;
    }

    public List<Integer> inOrderList() {
        return inOrderList(overallRoot, new LinkedList<>());
    }

    private List<Integer> inOrderList(IntTreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        inOrderList(root.left, list);
        list.add(root.data);
        inOrderList(root.right, list);
        return list;
    }

    public void evenLevels() {
        overallRoot = evenLevels(overallRoot, 1);
    }

    private IntTreeNode evenLevels(IntTreeNode root, int level) {
        if (root == null) {
            return null;
        }
        if (level % 2 == 1 && (root.left == null && root.right == null)) {
            return null;
        }
        root.left = evenLevels(root.left, level + 1);
        root.right = evenLevels(root.right, level + 1);
        return root;
    }

    public void makePerfect() {
        overallRoot = makePerfect(overallRoot, height());
    }

    private IntTreeNode makePerfect(IntTreeNode root, int height) {
        if (root == null) {
            root = new IntTreeNode(0);
        }
        if (height == 0) {
            return null;
        } else {
            root.left = makePerfect(root.left, height - 1);
            root.right = makePerfect(root.right, height - 1);
            return root;
        }
    }

    public int height() {
        return height(overallRoot);
    }

    private int height(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    public int matches(IntTree other) {
        return matches(overallRoot, other.overallRoot);
    }

    private int matches(IntTreeNode root1, IntTreeNode root2) {
        if (root1 == null || root2 == null) {
            return 0;
        } else {
            int count = matches(root1.left, root2.left) + matches(root1.right, root2.right);
            if (root1.data == root2.data) {
                return 1 + count;
            } else {
                return count;
            }
        }
    }
}
