import java.util.Scanner;

public class getChange {
    public static int getResult(int N){
        int money = 1024-N;
        if(money==1024){
            return 0;
        }
        int mod64 = money%64;
        int change64 = money/64;
        if(mod64==0){
            return change64;
        }
        int mod16 = mod64%16;
        int change16 = mod64/16;
        if(mod16==0){
            return change64+change16;
        }
        int mod4 = mod16%4;
        int change4 = mod16/4;
        if(mod4==0){
            return change64+change16+change4;
        }else{
            return change64+change16+change4+mod4;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        int result = getResult(a);
        System.out.println(result);
    }
}
