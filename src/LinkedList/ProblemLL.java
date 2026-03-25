package LinkedList;

public class ProblemLL {
    public static Node reverse(Node head){
        Node prev= null;
        Node curr= head;
        while(curr!=null){
            Node front= curr.next;
            curr.next= prev;
            prev= curr;
            curr= front;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head= new Node(9);
        head.next= new Node(9);
        head.next.next= new Node(9);

        Node temp= reverse(head);
        Node curr= temp;
        int carry=1;
        while(curr!=null && carry>0) {
            int sum = curr.val + carry;
            curr.val = sum % 10;
            carry = sum / 10;
            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
            }
            curr = curr.next;
        }
        Node ans= reverse(temp);
        while(ans!=null){
            System.out.print(ans.val);
            ans= ans.next;
        }
    }
}
