/**
 * 动态规划
 *
 * f(n) = max(f(i)*f(n-i))
 */
public class demo1 {
    public int cutScopeSolution(int length){
        if(length<2){
            return 0;
        }else if(length==2){
            return 1;
        }else if(length==3){
            return 2;
        }
        //创建辅助数组  存储  已产生的最小值
        int[] arr = new int[length + 1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        /**
         *
         *  这些情况下，不剪的时候长度比剪的时候长，所以作为初始条件
         *  这些都是子问题最优解,因为是子问题，所以这些情况可以不剪，因为可以看成它是分割后的一部分
         */
        int max = 0;
        for(int i = 4;i<=length;i++){
            max = 0;
            for(int j = 1;j<=i/2;j++){
                int temple = arr[j]*arr[i-j];
                if(max<temple){
                    max=temple;
                }
                arr[i]=max;
            }
        }
        return arr[length];
    }
}
