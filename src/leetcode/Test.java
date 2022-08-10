package leetcode;

public class Test {
    public static void main(String[] args) {
    ListNode listNode=new ListNode(2);
    listNode.next=new ListNode(4);
    listNode.next.next=new ListNode(3);

    ListNode listNode1=new ListNode(5);
    listNode1.next=new ListNode(6);
    listNode1.next.next=new ListNode(4);
    ListNode ans=addTwoNumbers(listNode,listNode1);
        System.out.println(ans);
    }
    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
    static ListNode output=null;
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int remainder=0;
        while(l1!=null || l2!=null || remainder>0)
        {
            int valL1=l1!=null?l1.val:0;
            int valL2=l2!=null?l2.val:0;
            int sum=(valL1+valL2+remainder);
            int value=sum%10;
            linkedNode(value);
            remainder=(int)Math.floor(sum/10);
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        return output;
    }
    public static void linkedNode(Integer val)
    {
        ListNode curr=new ListNode(val);
        if(output==null)
        {
            output=curr;
            return;
        }
        ListNode temp=output;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=curr;
    }
}
