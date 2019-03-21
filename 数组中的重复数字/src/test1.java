import sun.applet.Main;

import java.util.Arrays;
import java.util.List;
public class test1 {
    public static void main(String[] args) {
        int[] ints = {2,3,5,4,3,2,6,7};
        RepeatNumber2 repeatNumber = new RepeatNumber2();
        List<Integer> number = repeatNumber.getRepeatNumber(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(number);
    }
}
