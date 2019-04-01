import java.util.Arrays;
import java.util.Scanner;

/**
 * 用一个scanner输入一个int数组
 *
 */
public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(arr));
    }
}
