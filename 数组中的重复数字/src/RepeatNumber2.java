import java.util.ArrayList;
import java.util.List;
/*
* 需求：不能修改原数组
* */
public class RepeatNumber2 {
    public List<Integer> getRepeatNumber(int arr[]){
        int arrLength=arr.length+1;
        //初始化辅助数组   并将值赋为-1
        int[] arr1 = new int[arrLength];
        for(int i = 0;i<arr1.length;i++){
            arr1[i]=-1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i < arr.length;i++){
            if(arr1[arr[i]] == -1){
                arr1[arr[i]]=arr[i];
            }else{
                list.add(arr[i]);
            }
        }
        return list;
    }
}
