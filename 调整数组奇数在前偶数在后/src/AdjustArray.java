

import java.util.Arrays;

public class AdjustArray {
    //调整数组   奇数在前半部分  偶数在后半部分
    public static int[] adjustArrayByOddEven(int[] arr) {
        int length = arr.length;
        int firstEven = 0 ;
        //抓取数组中的第一个偶数的坐标
        for(int i = 0;i < length;i++) {
            if(arr[i]%2==0) {
                //获取第一个偶数
                firstEven = i;
                System.out.println(firstEven);
                break;
            }
        }

        //便利数组，遇到坐标大于 firstEven的奇数，和firstEVen交换
        for(int i = 0; i < length;i++) {
            int temp;
            if(arr[i]%2==1 && i > firstEven) {
                //交换
                temp = arr[i];
                arr[i] = arr[firstEven];
                arr[firstEven] = temp;
                firstEven = i;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,4,6,1,3,5};
        int[] result = adjustArrayByOddEven(arr);
        System.out.println(Arrays.toString(result));

    }
}