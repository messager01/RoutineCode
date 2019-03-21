public class test1 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        ListNode node4 = new ListNode();
        ListNode node5 = new ListNode();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node5.data = 5;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        demo demo = new demo();
        demo.printReverse(node1);
    }
}
