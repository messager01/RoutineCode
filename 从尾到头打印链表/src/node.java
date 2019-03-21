import java.util.Stack;

public class node {
    int data;
    node next;



    public static void reversePrint(node node){
        Stack<node> stack = new Stack<node>();
        while(node !=null ){
            stack.push(node);
            node=node.next;
        }
        while(!stack.empty()){
            System.out.println(stack.pop().data);
        }
    }


    public static void main(String[] args) {
        node node1 = new node();
        node1.data=1;
        node node2 =  new node();
        node2.data=2;
        node node3 =  new node();
        node3.data=3;
        node node4 =  new node();
        node4.data=4;
        node node5 =  new node();
        node5.data=5;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        reversePrint(node1);
    }
}
