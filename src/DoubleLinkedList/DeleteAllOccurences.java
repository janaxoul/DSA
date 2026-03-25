package DoubleLinkedList;

public class DeleteAllOccurences {
    public Node deleteAllOccurrences(Node head, int target) {
        if(head==null || head.next==null){
            if(head.val== target){
                return null;
            }
        }
        while(head.val==target) {
            head = head.next;
        }
        Node temp= head;
        Node prev= null;
        while(temp.next!=null){
            temp.prev=prev;
            Node next= temp.next;
            if(temp.val==target){
                next.prev= prev;
                prev.next= next;
                temp=prev;
            }
            prev=temp;
            temp= temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head= new Node();

    }
}
