import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class StackLinkedList {
    private ListNode top;
    private int length;
    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
        }

    }
    public StackLinkedList(){
        top=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public  boolean isEmpty(){
        return length==0;
    }
    public void push(int value){
        ListNode newNode = new ListNode(value);
            newNode.next=top;
            top=newNode;
            length++;
    }
    public void pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = top.data;
        top=top.next;
        length--;
        return;

    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        ListNode current = top;
        while(current!=null) {
            System.out.print(top.data+"-->");
            current = current.next;

        }
        System.out.println();
        System.out.println("length of stack");
        return length();
    }

    public static void main(String[] args) {
        StackLinkedList skll = new StackLinkedList();
        skll.push(55);
        skll.push(56);
        System.out.println(skll.peek());
        skll.pop();
        System.out.println(skll.peek());
    }

}
