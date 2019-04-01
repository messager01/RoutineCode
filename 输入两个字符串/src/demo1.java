import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个数组
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int[] arr = new int[a];
        for(int i = 0;i < a;i++){
            arr[i] = scanner1.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
