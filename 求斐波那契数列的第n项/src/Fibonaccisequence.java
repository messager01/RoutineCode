//写一个函数，输入n，求斐波那契数列的第n项
public class Fibonaccisequence {
    /**
     *递归处理
     */
    public static long  printFibonaccisequence(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return printFibonaccisequence(n-1)+printFibonaccisequence(n-2);
        }
    }

    //非递归处理
    public static long  getFibonaccisequence(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        long firstMinus = 0;
        long secondMinus = 1;
        long N = 0;
        for(int i=2;i<=n;i++){
            N = firstMinus + secondMinus;
            firstMinus = secondMinus;
            secondMinus = N;
        }
        return  N;
    }


    public static void main(String[] args) {
        long i = Fibonaccisequence.getFibonaccisequence(2);
        long i2 = Fibonaccisequence.printFibonaccisequence(5);
        System.out.println(i);
        if(i==i2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
