import java.util.Arrays;

public class demo2 {
    public static int[] adjustArrayByOddEven(int[] arr) {
        int evenSum = 0;
        for(int i =0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                evenSum++;
            }
        }
        int[] even = new int[evenSum];
        int[] odd = new int[arr.length-evenSum];
        int[] result = new int[arr.length];
        int m = 0;  //偶数数组下标
        int n = 0;  //奇数数组下表
        //int k = 0;   //结果数组的下表
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                even[m]=arr[i];
                m++;
            }else {
                odd[n]=arr[i];
                n++;
            }
        }
        for(int i=0;i < odd.length;i++) {
            result[i]=odd[i];
        }
        for(int i = odd.length,k=0;i<evenSum;i++,k++) {
            result[i]=even[k];
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,4,6,1,3,5};
        int[] result = adjustArrayByOddEven(arr);
        System.out.println(Arrays.toString(result));
    }

}
