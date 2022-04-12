import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueLinkedList {
    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public int length(){
        return length;

    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            front=newNode;
        }else{
            rear.next=newNode;
        }
        rear=newNode;
        length++;
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");

    }
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();
        qll.enqueue(5);
        qll.enqueue(6);
        qll.dequeue();
        qll.display();

    }
}
