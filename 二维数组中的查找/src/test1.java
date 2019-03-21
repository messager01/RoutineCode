public class test1 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int i = 7;
        Demo1 demo1 = new Demo1();
        boolean b = demo1.find(ints, i);
        System.out.println(b);
    }
}
