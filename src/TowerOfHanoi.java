public class TowerOfHanoi {
    static int s=0;
    static void towerOfHanoi(int n, int from_rod, int to_rod, int aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            s=s+1;
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        s=s+1;
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }


    public static void main(String args[])
    {
        int n = 5; // Number of disks
        towerOfHanoi(n,1,2,3);
        System.out.println(s);
    }
}
