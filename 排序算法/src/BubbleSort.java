import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i =arr.length-1;i>1;i--){
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    Swap.swap(arr,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={9,5,1,7,3,2,4,6,8};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
