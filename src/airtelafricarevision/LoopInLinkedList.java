package airtelafricarevision;

public class LoopInLinkedList {

    public static void main(String[] args) {

        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);
        Node n7=new Node(7);
        Node n8=new Node(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n6;
        /**
         *   1->2->3->4->5->6->7->8->5
         */
        Node n=findLoopInLinkedList(n1);
        System.out.println(n.value);
    }

    private static Node findLoopInLinkedList(Node node) {
        if (node==null)
            return null;

        if (node.next==null)
            return null;

        Node tortoise=node;
        Node rabbit=node;

        while (rabbit!=null && rabbit.next!=null)
        {
            tortoise=tortoise.next;
            rabbit=rabbit.next.next;
            if (tortoise==rabbit)
                break;
        }
        if (rabbit!=tortoise)
            return null;

        Node pointer=node;
        while (pointer!=tortoise)
        {
            tortoise=tortoise.next;
            pointer=pointer.next;
        }

       return tortoise;
    }
}
