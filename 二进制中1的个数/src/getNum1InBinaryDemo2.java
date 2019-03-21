public class getNum1InBinaryDemo2 {
    public static int getNum2InBinaryDemo2(int n){
        /**
         * n&(n-1)
         * 一个不为0的数减去1    二进制会变为：  最右边的1会变成0    该位置上的1 的右边的0会变成1
         *                                       该位置1的左边的数不会变
         *              二进制 1100  -1   得   1011
         */
        int count = 0;
        while (n!=0){
            count ++;
            n=n&(n-1);
        }
        return count;
    }

}
