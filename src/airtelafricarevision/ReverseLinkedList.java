package airtelafricarevision;

public class ReverseLinkedList {

    public static void main(String[] args) {

        SinglyLinkedList linkedList=new SinglyLinkedList();
        linkedList.addAtHead(4);
        linkedList.addAtHead(3);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        System.out.println(linkedList);
        reverseLinkedList(linkedList.head);
    }

    public static Node reverseLinkedList(Node node)
    {
        if (node==null)
            return null;

        Node prev=null;
        Node curr=node;

        // 1->2->3->4->null
        // null<-1<-2<-3<-4
        while (curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
