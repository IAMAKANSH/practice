package leetcode;

public class ValidateBinaryTree {

    public static void main(String[] args) {
        Node root=new Node(1);
        Node left=new Node(3);
        Node right=new Node(2);
        root.left=left;
        root.right=right;
        Tree tree=new Tree(root);
        System.out.println(tree);
        Boolean res=isValidBST(tree.root);
        System.out.println(res);
    }

    private static Boolean isValidBST(Node root) {
        if (root==null)
        {
            return true;
        }
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static Boolean helper(Node root, Integer min,Integer max) {
        if (root==null)
            return true;
        if (root.value>=max || root.value<=min)
            return false;
        return helper(root.left,min,root.value) && helper(root.right,root.value,max);
    }
}
class Node
{
    Integer value;
    Node left;
    Node right;

    public Node(Integer value) {
        this.value = value;
        this.left=null;
        this.right=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
class Tree{
    Node root;

    public Tree() {
        this.root=null;
    }

    public Tree(Node root) {
        this.root = root;
    }

    public void insert(Integer value)
    {
        Node curr=new Node(value);
        if(this.root==null)
        {
            this.root=curr;
            return;
        }
        Node temp=root;
        while (true)
        {
                if(temp.value>value)
                {
                    if (temp.left==null)
                    {
                        temp.left=curr;
                        return;
                    }
                    temp=temp.left;
                }
                else{
                    if (temp.right==null)
                    {
                        temp.right=curr;
                    }
                    temp=temp.right;
                }
        }
    }

    public boolean find(Integer value)
    {
        if (this.root==null)
            return false;
        Node temp=this.root;
        while (temp!=null)
        {
            if (temp.value==value)
                return true;
            if (temp.value>value)
            {
                temp=temp.left;
            }
            else
            {
                temp=temp.right;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
