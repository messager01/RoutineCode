import java.util.Arrays;

public class Swap {
    //定义交换数组中两个元素的方法
    public static void swap(int[] arr,int m ,int n){
        int temp;
        temp = arr[m];
        arr[m] = arr[n];
        arr[n]= temp;
    }

}
