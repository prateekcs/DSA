public class BinaryTreeByArray {
    int arr[];
    int lastusedindex;
    public BinaryTreeByArray(int size){
        arr=new int[size+1];
        lastusedindex=0;

    }
    public void insert(int value){
        if(arr.length-1==lastusedindex){
            System.out.println("Array is full");
        }
        else{
            arr[lastusedindex+1]=value;
            lastusedindex++;
        }
    }
    public void preOrder(int crootindex){
        if(crootindex>lastusedindex){
            return;//base class
        }
        System.out.print(arr[crootindex]+" ");
        preOrder(crootindex * 2);
        preOrder(crootindex * 2 + 1);

    }
    public void inOrder(int crootindex){
        if(crootindex>lastusedindex){
            return;//base case
        }
        inOrder(crootindex*2);
        System.out.print(arr[crootindex]+" ");
        inOrder(crootindex*2+1);

    }
    public void postOrder(int crootindex){
        if(crootindex>lastusedindex){
            return;//base case
        }
        preOrder(crootindex*2);
        preOrder(crootindex*2+1);
        System.out.println(arr[crootindex]+" ");
    }

    public static void main(String[] args) {
        BinaryTreeByArray bta = new BinaryTreeByArray(6);
        bta.insert(10);
        bta.insert(5);
        bta.insert(30);
        bta.insert(3);
        bta.insert(50);
        System.out.println("Preorder");
        bta.preOrder(1);
        System.out.println();
        System.out.println("inorder");
        bta.inOrder(1);
        System.out.println();
        System.out.println("postorder");
        bta.postOrder(1);
    }
}
