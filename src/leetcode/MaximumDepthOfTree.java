package leetcode;

public class MaximumDepthOfTree {

    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        Tree tree=new Tree(root);
        System.out.println(tree);
        int count=maxDepth(tree.root);
        System.out.println(count);
    }

    private static int maxDepth(Node root) {
        if(root==null)
            return -1;
        return helper(root);
    }

    private static int helper(Node root) {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        return Math.max(left,right)+1;
    }
}
