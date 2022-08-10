package airtelafricarevision;

public class Add2LinkedList {

    public static void main(String[] args) {
        Node n1=new Node(3);
        Node n2=new Node(2);
        Node n3=new Node(1);
        n1.next=n2;
        n2.next=n3;

        Node n4=new Node(9);
        Node n5=new Node(9);
        Node n6=new Node(9);
        n4.next=n5;
        n5.next=n6;

        Node ans=findSum(n1,n4);
        System.out.println(ans);
    }

    private static Node findSum(Node n1, Node n2) {

        int carry=0;
        Node curr=null;
        while (n1!=null || n2!=null || carry>0)
        {
            int value1=n1!=null?n1.value:0;
            int value2=n2!=null?n2.value:0;
            int sum= value1+value2+carry;
            int placeDigit=sum%10;
            if (curr!=null)
            {
                Node temp=curr;
                while (temp.next!=null)
                {
                    temp=temp.next;
                }
                Node c=new Node(placeDigit);
                temp.next=c;
            }
            else {
                curr=new Node(placeDigit);
            }
            carry = sum/10;
            n1=n1!=null?n1.next:null;
            n2=n2!=null?n2.next:null;
        }
        return curr;
    }
}
