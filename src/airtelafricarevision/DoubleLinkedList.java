package airtelafricarevision;

public class DoubleLinkedList {

    Connector head;
    int size;

    public DoubleLinkedList() {
        this.head=null;
        this.size=0;
    }

    public Boolean add(Integer value)
    {
        if (value==null)
            return false;
        Connector curr=new Connector(value);
        if(this.head==null)
        {
            this.head=curr;
            this.size++;
        }
        Connector temp=this.head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=curr;
        curr.prev=temp;
        this.size++;
        return true;
    }

    public Boolean delete(Integer index)
    {
        if (index<0 && index>size)
        {
            return false;
        }
        if (this.head==null)
        {
            return false;
        }
        int counter=0;
        Connector temp=this.head;
        while (counter!=index-1 && temp.next!=null){
            counter++;
            temp=temp.next;
        }
        if (counter!=index-1)
            return false;

        Connector next=temp.next.next;
        temp.next=next;
        next.prev=temp;
        return true;
    }

    public static void main(String[] args) {

        DoubleLinkedList linkedList=new DoubleLinkedList();
        linkedList.add(10);
        System.out.println(linkedList);
    }

    @Override
    public String toString() {
        return "DoubleLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
class Connector{

    int value;
    Connector next;
    Connector prev;

    public Connector(int value) {
        this.value = value;
        this.next=null;
        this.prev=null;
    }

    @Override
    public String toString() {
        return "Connector{" +
                "value=" + value +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}

