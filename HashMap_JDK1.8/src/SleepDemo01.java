public class SleepDemo01 {
    public static void main(String[] args) throws InterruptedException {
        int num = 10;
        while(true){
            System.out.println(num--);
            System.out.println(Thread.currentThread());
            Thread.sleep(1000);
            if(num <= 0) {
                break;
            }
        }
        System.out.println("BOOM！！！");
    }
}
