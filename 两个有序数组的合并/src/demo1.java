import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class demo1 {
    /**
     * CVTE最近组织了一场趣味知识竞赛，由于场地大小，参赛者被分到两个场地分别进行比赛，活动结束后，组织者小明却犯愁了，两个场地参赛者是分开进行排名的，现在需要把这两组有序的分数排名合并成一个总的排名表，于是小明求助于WEB的同时小张编写一个排名算法实现。假如你是小张，你会如何设计这个算法。
     *
     * 样例：
     *
     * 两组的分数排名分别为：[99, 92, 87, 80] [98, 90, 82]
     *
     * 汇总得到的排名结果：[99, 98, 92, 90, 87, 82, 80]
     */
   public static int[] getArr(int[] arr1,int[] arr2){
       int length1 = arr1.length;
       int length2 = arr2.length;
       int commonLength=length1>length2?length2:length1;
       int[] result = new int[length1+length2];
       //确定最后一位补位数
       int last;
       int i = 0;  //数字1的指针
       int j = 0;  //数组2的指针
       int k = 0;  //新数组的指针
       while (i<commonLength&&j<commonLength){
           if(arr1[i]<=arr2[j]){
               result[k]=arr2[j];
               j++;
               k++;
           }else{
               result[k] = arr1[i];
               k++;
               i++;
           }
       }
       //补充公共序列最后一位
       last = i>j?arr2[j]:arr1[i];
       result[commonLength*2-1] = last;
       if(length1>length2){
           for(int p =commonLength,o=commonLength*2;p<length1;p++,o++){
               result[o]=arr1[p];
           }
       }else{
           for(int p =commonLength,o=commonLength*2;p<length2;p++,o++){
               result[o]=arr2[p];
           }
       }
       return result;
   }

   public static int[] getArr2(int[] arr1,int[] arr2){
       ArrayList<Integer> list = new ArrayList<>();
       for (int i : arr1) {
           list.add(i);
       }
       for (int i : arr2) {
           list.add(i);
       }
       Collections.sort(list);
       Collections.reverse(list);
       //System.out.println(list);
       int[] result = new int[arr1.length + arr2.length];
       int m = 0;
       for (Integer integer : list) {
           result[m]=integer;
           m++;
       }

       return result;
   }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        int[] arr1={99,92,87};
        int[] arr2={98,90,82,78};
        int[] arr = getArr(arr1, arr2);
        System.out.println(Arrays.toString(arr));
        long end = System.currentTimeMillis();
        long result = end - begin;
        System.out.println("while用时："+result);

        long begin1 = System.currentTimeMillis();
        int[] result2 = getArr2(arr1, arr2);
        long end1 = System.currentTimeMillis();
        long consume = end1 - begin1;
        System.out.println(Arrays.toString(result2));
        System.out.println("sort用时："+consume);

    }
}
