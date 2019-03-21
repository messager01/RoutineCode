import sun.reflect.generics.tree.Tree;

public class binaryTreeNextNode {
    static StringBuilder stringBuilder = new StringBuilder();
    //对二叉树进行中序遍历
    public static void inOrder(TreeNode head){
        if(head==null){
            return;
        }
        inOrder(head.left);
        stringBuilder.append(head.value);
        inOrder(head.right);
    }

    public static String findNextNode(String str, TreeNode node){
        String s = new String();
        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i))==node.value){
                s = String.valueOf(str.charAt(i+1));
            }
        }
        return s;
    }
    public static void main(String[] args) {
        TreeNode h = new TreeNode("h", null, null);
        TreeNode i = new TreeNode("i", null, null);
        TreeNode d = new TreeNode("d", null, null);
        TreeNode e = new TreeNode("e", h, i);
        TreeNode f = new TreeNode("f", null, null);
        TreeNode g = new TreeNode("g", null, null);
        TreeNode b = new TreeNode("b", d, e);
        TreeNode c = new TreeNode("c", f, g);
        TreeNode a = new TreeNode("a", b, c);
        binaryTreeNextNode.inOrder(a);
        System.out.println(stringBuilder);
        String nextNode = binaryTreeNextNode.findNextNode(String.valueOf(stringBuilder), f);
        System.out.println(nextNode);
    }
}
