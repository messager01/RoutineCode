import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
       for(int i =0;i<arr.length-1;i++){
        int minIndex = i;
        for(int j = i+1;j<arr.length;j++){
            minIndex= arr[minIndex] < arr[j]? minIndex:j;
        }
            Swap.swap(arr,i,minIndex);
       }
    }

    public static void main(String[] args) {
        int arr[]={9,5,1,7,3,2,4,6,8};
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
