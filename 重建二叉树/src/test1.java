import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] n = {1,2,3};
        int[] m = Arrays.copyOfRange(n,1,1);
        System.out.println(Arrays.toString(m));
    }
}
