import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                Swap.swap(arr, j, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={9,5,1,7,3,2,4,6,8};
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
