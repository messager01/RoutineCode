import java.io.PushbackInputStream;
import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSorting {
    public static int[] heapSorting(int[] arr){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int[] ints = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            heap.add(arr[i]);
        }
        while(!heap.isEmpty()){
            for(int i=0;i<arr.length;i++){
                ints[i]=heap.poll();
            }
        }
        return ints;
    }


    public static void main(String[] args) {
        int[] ints = HeapSorting.heapSorting(new int[]{1, 4, 85, 51, 2, 47, 1, 7, 1, 8, 9, 33});
        System.out.println(Arrays.toString(ints));
    }
}
