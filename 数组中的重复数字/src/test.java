import sun.applet.Main;
import java.util.List;
public class test {
    public static void main(String[] args) {
        int[] ints = {2,3,1,0,2,5,3};
        RepeatNumber repeatNumber = new RepeatNumber();
        List<Integer> number = repeatNumber.getRepeatNumber(ints);
        System.out.println(number);
    }
}
