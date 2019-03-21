import java.util.Arrays;

public class QuickSort {

    /**
     *partition的处理
     * 当前数<p  当前数和小于区的后一个数交换   <区向右扩   当前数跳下一个
     *
     * 当前数>p   当前数和大于区的前一个数交换    >大于区左扩    当期当前数不变
     *
     * 当前数=p    当前数跳下一个
     */

    //这是一个处理arr[L.....R]的函数
    //默认以arr[r]  做划分   arr[r]  --->  p   <p    ==p    >p
    //返回等于区域的左边界和右边界  返回一个长度为2的数组result  result[0]为左边界  result[1]为右边界
    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;  //   less <区域 的右边界  在L再左边的位置
        int more = R;   //   more  >区域  的左边界   一开始就把最后一个数放在<区中   不希望最后一个数动
        while (L < more) {//L表示当前数的位置
            if (arr[L] < arr[R]) {  //arr[R] 为划分值  永远不会动      当前值小于划分值的时候
                //操作1  把小于区的后一个数和当前数交换
                //操作2   把小于区向右扩一个位置
                //操作3   当前位置向右移动一个位置
                Swap.swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {//当前数大于划分值
                //操作1  把大于区的前一个位置和当前数交换
                //操作2   大于区向左扩一个位置
                Swap.swap(arr, --more, L);
            } else {
                //当前数等于划分值  单纯的跳下一个
                L++;
            }
        }
        //处理结束之后，小于区的数据正确   等于区的数据正确    大于区的最后一个数据实际上是相等的
        //把大于区的最后一个数  和大于区的第一个数交换
        Swap.swap(arr, more, R);
        //less是小于区的最后一个位置    more等于区的最后一个数
        return new int[] { less + 1, more };
    }

        //把arr[L...R]上排好序
    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            //重要优化
            Swap.swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);  //  <区
            quickSort(arr, p[1] + 1, R);  //  >区
        }
    }

    public static void main(String[] args) {
        int arr[]={3,6,0,5,7,6,5};
        quickSort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
}
