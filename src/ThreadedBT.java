public class ThreadedBT {
    static class Node{
        int data;
        Node left;
        Node right;
        boolean LeftThread;
        boolean RightThread;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
            LeftThread = false;
            RightThread = false;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(30);
        Node n2 = new Node(40);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.left = n1;
        dummy.right = dummy;
        dummy.RightThread = true;
        n2.RightThread = true;
        n2.right=n1;
        n4.right=n2;
        n4.RightThread = true;
        n3.right=dummy;
        n3.RightThread = true;
    }
}
