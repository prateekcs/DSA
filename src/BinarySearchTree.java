public class BinarySearchTree {
    private static TreeNode root;
    private static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }

    }
    public Object insert(int value){
        return root=insert(root,value);
        //return null;
    }
    public TreeNode insert(TreeNode root, int value){
        if(root==null){
            root=new TreeNode(value);
            return root;//base case
        }
        if(value<root.data){
            root.left=insert(root.left, value);
        }else{
            root.right=insert(root.right, value);
        }
        return root;
    }
    public void successor(){
        TreeNode rroot=root.right;
        successor(rroot);
    }
    public void successor(TreeNode rroot){
        if(rroot==null){
            return;
        }
        //System.out.print(rroot.data+" ");
        successor(rroot.left);
        //preOrder(root.right);
    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //public void countNodes(){countNodes(root);
    //}
    public int countNodes(TreeNode root){
        if(root==null) {
            return 0;
        }
        int count=0;
        if (root.left != null && root.right != null) {
            count++;
            count += (countNodes(root.left) + countNodes(root.right));
        }
        return count;
    }
    public TreeNode delete(TreeNode root, int x) {
        if(root==null) {
            return null;
        }
        root.left=delete(root.left,x);
        root.right=delete(root.right,x);
        if(root.data==x && root.left==null&&root.right==null){
            return null;
        }
        return root;
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(6);
        bst.insert(11);
        bst.insert(17);
        System.out.println("previous tree");
        bst.preOrder();
        TreeNode temp = root;
        temp.data=root.data;
        TreeNode rroot=root.right;
        //bst.successor();
        root.data=rroot.left.data;
        //rroot.left.data=temp.data;
        System.out.println("rroot "+rroot.left.data);
        System.out.println();
        System.out.println("new updated root "+root.data);
        System.out.println();
        System.out.println("new tree");
        //bst.delete(root,11);
        rroot.left=null;
        bst.preOrder();
        bst.countNodes(root);

    }
}
