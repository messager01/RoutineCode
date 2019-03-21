public class getNum1InBinaryDemo1 {
    public static int get1NumInBinary(int n){

        /**
         * 因为这个flag这个总是左移。当将这个
         * 传进来的n的所有位都&完了，这个flag还会继续左移，直到将这个1左移到这个int类型的最高位
         * 表示一个负数，然后将这个1移到最高表示位的左边，这个flag才会表示0这个while循环才会结束
         */
        int count = 0;
        int flag = 1;
        while (flag!=0){
            if((n&flag)!=0){
                count++;
            }
            flag=flag<<1;
        }
        return count;
    }
}
