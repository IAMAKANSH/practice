package airtelafricarevision;

public class SinglyLinkedList {
     Node head;
     Node tail;
     int size;

    public SinglyLinkedList() {
        this.head=null;
        this.tail=null;
        size=0;
    }

    public void addAtHead(int value)
    {
        Node curr=new Node(value);
        if (this.head==null)
        {
            this.head=curr;
            this.tail=curr;
        }
        else
        {
            curr.next=this.head;
            this.head=curr;
        }
        size++;
    }
    public Node getIndex(int index)
    {
        if (index< 0 || index>=size)
        {
            throw new NullPointerException("Index out of bound");
        }
        Node temp=this.head;
        int count=0;
        while (temp!=null && count!=index)
        {
            temp=temp.next;
            count++;
        }
        return temp;
    }
    public void addAtTail(int value)
    {
        Node curr=new Node(value);
        if (this.head==null)
        {
            this.head=curr;
            this.tail=curr;
        }
        else {
            this.tail.next=curr;
            this.tail=curr;
        }
        size++;
    }
    public void addAtIndex(int index,int value)
    {
        if (index< 0 || index>size)
        {
            System.out.println("Index is out of scope");
            return;
        }
        if (index==size)
        {
            addAtTail(value);
        }
        if (index==0)
        {
            addAtHead(value);
        }
        Node prev=this.getIndex(index-1);
        Node node=new Node(value);
        Node temp=prev.next;
        node.next=temp;
        prev.next=node;
        this.size++;
    }
    public void deleteAtIndex(int index)
    {
        if (index< 0 || index>=size)
        {
            System.out.println("Index is out of scope");
            return;
        }
        if (index==0)
        {
            Node temp=this.head;
            this.head=temp.next;
            size--;
            if (size==0)
            {
                this.tail=null;
            }
        }
        if(index==this.size-1)
        {
              Node newIndex=getIndex(index-1);
              this.tail=newIndex;
              newIndex.next=null;
              size--;
        }
        Node prev=getIndex(index-1);
        Node temp=prev.next;
        Node next=temp.next;
        prev.next=next;
        size--;

    }
    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

            SinglyLinkedList linkedList=new SinglyLinkedList();
            System.out.println(linkedList.size);
            linkedList.addAtHead(10);
        System.out.println(linkedList);
        linkedList.addAtHead(20);
        System.out.println(linkedList);
        linkedList.addAtHead(30);
        System.out.println(linkedList);
        linkedList.getIndex(1);
        System.out.println(linkedList);
        linkedList.deleteAtIndex(1);
        System.out.println(linkedList);
    }
}
class Node{
     int value;
     Node next;

    public Node(int value) {
        this.value = value;
        this.next=null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
