
import java.util.Arrays;

public class reConBinaryTreeByPostAndIn {
    public static TreeNode conBinaryTree(int[] post,int[] in){
        if(post==null||in==null){
            return null;
        }
        if(post.length==0||in.length==0){
            return null;
        }
        if(post.length!=in.length){
            return null;
        }
        TreeNode root = new TreeNode(post[post.length-1]);
        for(int i=0;i<in.length;i++){
            if(root.val == in[i]){
                root.left=conBinaryTree(Arrays.copyOfRange(post,0,i),Arrays.copyOfRange(in,0,i));
                root.right=conBinaryTree(Arrays.copyOfRange(post,i,post.length-1),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        //构建二叉树完成   输出根节点
        return root;
    }

    //前序输出打印
    public static void prePrint(TreeNode head){
        if(head == null){
            return;
        }
        System.out.print(head.val+" ");
        prePrint(head.left);
        prePrint(head.right);
    }

    //测试类
    public static void main(String[] args) {
        int[] post ={7,4,2,5,8,6,3,1};
        int[] in ={4,7,2,1,5,3,8,6};
        TreeNode treeNode = reConBinaryTreeByPostAndIn.conBinaryTree(post, in);
        reConBinaryTreeByPostAndIn.prePrint(treeNode);
    }
}
