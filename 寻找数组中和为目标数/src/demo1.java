import java.util.Arrays;

public class demo1 {
    /**
     * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [2，7]
     */
    public static int[] getArray(int[] arr,int target){
        int length = arr.length;
        int[] result = new int[2];
       for(int i = 0; i<length;i++){
           for(int j=i+1;j<length;j++){
               if(arr[i]+arr[j]==target){
                   result[0]=arr[i];
                   result[1]=arr[j];
               }
           }
       }
       return result;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        int[] array = getArray(arr, target);
        System.out.println(Arrays.toString(array));
    }
}
