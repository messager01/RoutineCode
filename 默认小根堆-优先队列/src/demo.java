import java.util.PriorityQueue;
public class demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(4);
        heap.add(7);
        heap.add(2);
        heap.add(1);
        heap.add(0);
        heap.add(9);
        heap.add(6);
        while (!heap.isEmpty()){
            System.out.print(heap.poll());
        }
    }
}
