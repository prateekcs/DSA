public class CircularSinglyLinkedList {
    private static ListNode last;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
        public void CircularSinglyLinkedList(){
            last=null;
        }
    }
    public void display(){
        if(last==null){
            System.out.println("no element present");
            return;
        }
        ListNode first = last.next;
        while(first!=last){
            System.out.print(first.data+"-->");
            first=first.next;
        }
        System.out.println(first.data);
    }
    public void createCircularLinkedList(){
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(7);
        ListNode fourth = new ListNode(8);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        last=fourth;
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(last==null){
            last=newNode;

        }else{
            newNode.next=last.next;
        }
        last.next=newNode;
    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(last==null){
            last=newNode;
            last.next=newNode;
        }else{

            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.createCircularLinkedList();
        cll.insertFirst(10);
        cll.insertLast(1);

        cll.display();
    }

}
