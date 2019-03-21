
public class binaryTree {
   public static Node initTree(){
       Node n7 = new Node(7,null,null);
       Node n8 = new Node(8,null,null);
       Node n4 = new Node(4,null,n7);
       Node n5 = new Node(5,null,null);
       Node n6 = new Node(6,n8,null);
       Node n2 = new Node(2,n4,null);
       Node n3 = new Node(3,n5,n6);
       Node n1 = new Node(1,n2,n3);
       return n1;

   }
    //前序遍历
   public static void preOrderRecur(Node head){
       if(head == null){
           return;
       }
       System.out.print(head.value+" ");
       preOrderRecur(head.left);
       preOrderRecur(head.right);
   }
   //中序遍历
    public static void inOrderRecur(Node head){
       if(head==null){
           return;
       }else{
           inOrderRecur(head.left);
           System.out.print(head.value+" ");
           inOrderRecur(head.right);
       }
    }

    //后序遍历
    public static void postOrderRecur(Node head){
       if (head == null){
           return;
       }else{
           postOrderRecur(head.left);
           postOrderRecur(head.right);
           System.out.print(head.value+" ");
       }
    }
    public static void main(String[] args) {
        Node node = binaryTree.initTree();
        System.out.print("先序遍历：");
        binaryTree.preOrderRecur(node);
        System.out.println();
        System.out.print("中序遍历：");
        binaryTree.inOrderRecur(node);
        System.out.println();
        System.out.print("后序遍历：");
        binaryTree.postOrderRecur(node);
    }
}
