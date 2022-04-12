public class fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;
    static void printFibonacci(int value){
        if(value>0){
            n3=n1+n2;
            System.out.print("+"+n3);

            n1=n2;
            n2=n3;
            printFibonacci(value-1);
        }
    }

    public static void main(String[] args) {
        fibonacci pf = new fibonacci();
        int value = 10;
        System.out.print(n1+"+");
        System.out.print(n2);
        pf.printFibonacci(value-2);
    }
}
