import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.Stack;

public class PushAndPop {
     static Stack<Node> stack1 = new Stack<>();
     static Stack<Node> stack2 = new Stack<>();
    //往stack1入栈   相当于在队尾插入
    public static void appendTail(Node node){
        stack1.push(node);
    }

    //从栈2出栈  相当于出队
    public static Node deleteHead() throws Exception {
        //如果两个栈都为空   抛出异常
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new Exception("队列为空");
        }
        //把stack1中的所有元素都pop且push到Stack2中
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public static void main(String[] args) throws Exception {
        PushAndPop.appendTail(new Node(1));
        PushAndPop.appendTail(new Node(2));
        System.out.println(PushAndPop.deleteHead());
        System.out.println(PushAndPop.deleteHead());
        PushAndPop.appendTail(new Node(3));
        System.out.println(PushAndPop.deleteHead());

    }
}
