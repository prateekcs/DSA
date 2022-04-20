public class ThreadedBTPhone {
    private static String Phone;
    private MyNode left;
    private MyNode right;
    private boolean RightThread;

    static class MyNode{
        private String Phone;
        private MyNode left;
        private MyNode right;
        private boolean RightThread;
        public MyNode(){
            this.Phone = Phone;
            this.left = null;
            this.right = null;
            this.RightThread = false;
        }

        public String getPhone() {
            String[] s = Phone.split(Phone);
            return this.Phone;

            //return false;
        }
    }
        void MyNode(String Phone){
            this.Phone=Phone;
        }
        void setLeft(MyNode left){
            this.left=left;
        }
        void setRight(MyNode right){
            this.right=right;
        }
        MyNode getLeft(){
            return this.left;
        }
        MyNode getRight(){
            return this.right;
        }
        void setRightThread(boolean RightThread){
            this.RightThread=RightThread;
        }
        boolean getRightThread(){
            return this.RightThread;
        }
        String getPhone(){
            return this.Phone;
        }
        void setPhone(String Phone){
            this.Phone=Phone;
        }

    public ThreadedBTPhone(String Phone){
        this.Phone=Phone;
        this.left=null;
        this.right=null;
        this.RightThread=false;
    }

    public static void main(String[] args) {
        int triple = 3;
        int penta=5;
        int one=1;
        int two=2;
        int three=3;
        int four=4;
        int five=5;
        int six=6;
        int seven=7;
        int eight=8;
        int nine=9;
        int zero=0;
        int twice=2;
        String Phone="one two triple three penta five";

        //MyNode obj = new MyNode();
        Integer s=Integer.parseInt(Phone);
        System.out.println(s);
        //System.out.println(obj.getPhone());


    }
}
