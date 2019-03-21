import sun.reflect.generics.tree.Tree;

public class binaryTree {
    public static TreeNode initTree(){
        TreeNode h = new TreeNode("h", null, null);
        TreeNode i = new TreeNode("i", null, null);
        TreeNode d = new TreeNode("d", null, null);
        TreeNode e = new TreeNode("e", h, i);
        TreeNode f = new TreeNode("f", null, null);
        TreeNode g = new TreeNode("g", null, null);
        TreeNode b = new TreeNode("b", d, e);
        TreeNode c = new TreeNode("c", f, g);
        TreeNode a = new TreeNode("a", b, c);
        return a;
    }
}
