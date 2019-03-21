import java.util.Stack;
public class demo {
    public void printReverse(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode);
            listNode=listNode.next;
        }
        while(!stack.empty()){
            System.out.print(stack.pop().data);
        }
    }
}
