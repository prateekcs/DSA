public class BinarySearchTreeByArray {
    int arr[];
    int lastusedindex;
    public BinarySearchTreeByArray(int size) {
        arr = new int[size + 1];
        lastusedindex = 0;
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
        if(crootindex + 1 > crootindex) {
            preOrder(crootindex * 2);
        }
        if(crootindex + 1 < crootindex) {
            preOrder(crootindex * 2+1);
        }

    }
    public static void main(String[] args) {
        BinarySearchTreeByArray bsta = new BinarySearchTreeByArray(8);
        bsta.insert(30);
        bsta.insert(20);
        bsta.insert(50);
        bsta.insert(25);
        bsta.insert(35);
        bsta.insert(40);
        bsta.insert(10);
        bsta.preOrder(1);

    }



}


