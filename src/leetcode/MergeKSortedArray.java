package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArray {
    public static void main(String[] args) {
        Node node1=new Node(1);
        node1.next=new Node(4);
        node1.next.next=new Node(5);

        Node node2=new Node(1);
        node2.next=new Node(2);
        node2.next.next=new Node(4);
        Node node3=new Node(2);
        node3.next=new Node(6);
//        System.out.println(node1);
//        System.out.println(node2);
//        System.out.println(node3);
        List<Node> input= Arrays.asList(node1,node2,node3);
        Node res=mergeKList(input);
        System.out.println(res);

    }

    private static Node mergeKList(List<Node> input) {
        if (input.isEmpty())
            return null;
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for (int i=0;i<input.size();i++)
        {
            Node curr=input.get(i);
            while (curr!=null)
            {
                queue.add(curr.val);
                curr=curr.next;
            }
        }
        Node output=null;
        while (!queue.isEmpty())
        {
            Node curr=new Node(queue.poll());
            if (output==null)
            {
                output=curr;
            }
            else
            {
            Node temp=output;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=curr;
            }
        }
        return output;
    }

    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next=null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
