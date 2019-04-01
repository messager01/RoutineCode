import java.util.Arrays;
import java.util.Scanner;

/**
 * 使用两个scanner
 *   3
 *   shi
 *   pei
 *   xin
 *   [shi,pei,xin]
 *
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);   //用于接收数组的大小
        Scanner scanner2 = new Scanner(System.in);    //用于接收数组内容
        int n = scanner1.nextInt();
        String[] arr = new String[n];
        for(int i = 0;i < n;i++){
            arr[i] = scanner2.nextLine();
        }
        scanner1.close();
        scanner2.close();
        System.out.println(Arrays.toString(arr));
    }
}
