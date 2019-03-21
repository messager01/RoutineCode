public class demo1 {
    /**
     * 一个数组中，只有一种数字出现了奇数次，其他数字都出现了偶数次
     * 使用有限变量获得该数字
     */
    public static int getNumber(int[] arr){
        int num = 0;
        for(int i =0;i<arr.length;i++){
            num = num^arr[i];
        }
        return num;
    }


    public static void main(String[] args) {
        int num = demo1.getNumber(new int[]{1,2,2,1,3,3,5,4,5});
        System.out.println(num);
    }
}
