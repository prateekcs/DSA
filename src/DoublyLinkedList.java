import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public class ListNode {
        int data;
        ListNode previous;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;

    }

    public boolean isEmpty() {
        return length == 0;

    }

    public int length() {
        return length;
    }

    public void displayForward() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {

        if(tail == null){
            return;
        }
            ListNode temp = tail;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.previous;
            }
            System.out.println("null");
    }
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            tail=newNode;
        }else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            tail=newNode;
        }else{
            tail.next=newNode;
        }
        newNode.previous=tail;
        tail=newNode;
        length++;
    }
    public void deleteFirst(){
        if(head==null){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head==tail){
            head=null;
        }else{
            head.next.previous=null;

        }
        head=head.next;
        temp.next=null;
        length--;
        return;

    }
    public void deleteLast(){
        if(head==null){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.next=null;
        length--;
        return;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(5);
        dll.insertFirst(6);
        dll.insertLast(10);
        dll.displayForward();
        dll.displayBackward();
        dll.deleteFirst();
        dll.deleteLast();

        dll.displayForward();
        dll.displayBackward();
    }
}
