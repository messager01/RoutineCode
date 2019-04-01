import java.util.Arrays;
import java.util.Scanner;

public class demo4 {
    /**
     *
     * @param args
     * 输入两个数组
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int na = scanner.nextInt();
        int nb = scanner.nextInt();
        int[] aa = new int[na];
        int[] bb = new int[nb];
        int i = 0;
        while (scanner.hasNext()) {
            aa[i++] = scanner.nextInt();
            if (i == aa.length) {
                break;
            }
        }
        i = 0;
        while (scanner.hasNext()) {
            bb[i++] = scanner.nextInt();
            if (i == bb.length) {
                break;
            }
        }
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(bb));
    }
}
