import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatNumber {
    public List<Integer> getRepeatNumber(int arr[]){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i < arr.length;i++){
         if(arr[i-1]==arr[i])
            list.add(arr[i]);
        }
        return list;
    }
}
