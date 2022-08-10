package airtelafricarevision;

public class RemoveDuplicateFromLinkedList {

    public static void main(String[] args) {

        SinglyLinkedList linkedList=new SinglyLinkedList();
        linkedList.addAtHead(4);
        linkedList.addAtHead(4);
        linkedList.addAtHead(4);
        linkedList.addAtHead(3);
        linkedList.addAtHead(2);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        System.out.println(linkedList);
        Node curr=removeDuplicate(linkedList.head);
        System.out.println(curr);
    }

    public static Node removeDuplicate(Node node){
        Node curr=node;
        while (curr!=null)
        {
            Node nextDistinct=curr.next;
            while (nextDistinct!=null && curr.value==nextDistinct.value )
            {
                nextDistinct=nextDistinct.next;
            }
            curr.next=nextDistinct;
            curr=nextDistinct;
        }return node;
    }
}
