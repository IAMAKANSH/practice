package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class SerializeAndDeserialize {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(5);
        root.right.left=new Node(4);
        Tree tree=new Tree(root);
        String res=serialize(tree.root);
        System.out.println(res);
        Node root1=deserialize(res);
        System.out.println(root1);
    }

    private static Node deserialize(String data) {

        LinkedList<String> queue=new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(queue);
    }

    private static Node helper(LinkedList<String> queue) {

        String s=queue.poll();
        if (s.equals("null"))
        {
            return null;
        }
        Node output=new Node(Integer.valueOf(s));
        output.left=helper(queue);
        output.right=helper(queue);
        return output;
    }

    private static String serialize(Node root) {
        if (root==null)
            return "null";
        String left=serialize(root.left);
        String right=serialize(root.right);
        return root.value+","+left+","+right;
    }
}
