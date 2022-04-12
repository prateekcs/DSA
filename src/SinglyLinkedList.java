

public class SinglyLinkedList
{
    private ListNode head;
    //private ListNode tail;

    private static class ListNode{
        private int data;
        private ListNode next;
        //private int length;

        public ListNode(int data){
            this.data=data;
            this.next=null;
            //this.length=0;
        }
    }
    public SinglyLinkedList(){
        //this.tail.next=null;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        /*sll.head = new ListNode(10);
        ListNode second = new ListNode(15);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(25);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;*/
        //sll.tail = fourth;

        //System.out.println();

        sll.insertFirst(30);

        sll.insertLast(50);
        sll.insertFirst(60);
        sll.insert(3,65);
        //sll.deleteFirst();
        sll.display();
        System.out.println(sll.length());
        //sll.deleteFirst();
        //sll.deleteLast();
        sll.delete(2);
        sll.deleteNode(50);
        sll.display();
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public int length(){
        if(head==null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;

        }
        return count;
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
            //head.next=null;
            return ;
        }
        ListNode current = head;
        while(null != current.next){
            current=current.next;
        }
        current.next = newNode;
    }
    public void insert(int position,int value){
        ListNode newNode = new ListNode(value);
        if(position==1){
            newNode.next=head;
            head = newNode;
        }else {
            ListNode previous = head;
            int count = 1;
            while(count<=position-1){
                previous=previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next=current;
            previous.next=newNode;
        }

    }
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }
    public ListNode deleteLast(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            head = null;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return null;
    }
    public void delete(int position){
        if(position==1){
            head=head.next;

        }else{
            ListNode previous = head;
            int count = 1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next=current.next;
        }
    }
    public void deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null;
        while(current!=null&&current.data!=key){
            temp=current;
            current = current.next;

        }
        if(current==null){
            return;
        }
        temp.next=current.next;
    }
}



