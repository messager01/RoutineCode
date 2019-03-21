import java.util.Arrays;

public class reConBinaryTreeByPreAndIn {
    public static TreeNode conBinaryTree(int[] pre,int[] in){
        if(pre==null||in==null){
            return null;
        }
        if(pre.length==0||in.length==0){
            return null;
        }
        if(pre.length!=in.length){
            return null;
        }
        //根据先序，可以直接确定根的值
        TreeNode root = new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(root.val==in[i]){
                root.left=conBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=conBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        //二叉树构建完毕，返回根节点root
        return root;
    }

    //后序遍历打印二叉树
    public static void postPrint(TreeNode head){
        if(head == null){
            return;
        }
        postPrint(head.left);
        postPrint(head.right);
        System.out.print(head.val+" ");
    }


    //测试类
    public static void main(String[] args) {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in ={4,7,2,1,5,3,8,6};
        TreeNode root = reConBinaryTreeByPreAndIn.conBinaryTree(pre, in);
        reConBinaryTreeByPreAndIn.postPrint(root);
    }
}
