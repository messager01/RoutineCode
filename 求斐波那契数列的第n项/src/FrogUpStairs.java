/**
 * 一只青蛙 一次可以跳上一个台阶，也可以跳上两个台阶，求该青蛙跳上n阶台阶一共有多少种跳法
 */
public class FrogUpStairs {
    //递归
    public static long frogUpStairsByRecursive(long n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return frogUpStairsByRecursive(n-1)+frogUpStairsByRecursive(n-2);
        }

    }


    //非递归
    public static long FrogUpStairs(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        long firstMaxium = 1;
        long secondMaxium = 2;
        long N = 0;
        for (int i=3;i<=n;i++){
            N = firstMaxium + secondMaxium ;
            firstMaxium = secondMaxium;
            secondMaxium =N;
        }
        return N;
    }

    public static void main(String[] args) {
        //long i = FrogUpStairs.frogUpStairsByRecursive(30);
        long i1 = FrogUpStairs.FrogUpStairs(100);
        System.out.println(i1);
        //System.out.println(i);
    }
}
