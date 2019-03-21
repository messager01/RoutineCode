public class Demo1 {
    public boolean find(int[][] arr,int target){
        if(arr==null){
            return false;
        }
        int column = 0;
        int row = arr[0].length-1;
        //arr[0].length表示数组的行数
        //从做左下角找起
       while (column < arr[0].length && row >= 0 ){
           if(arr[row][column] == target){
               return true;
           }else if(arr[row][column] < target){
               column++;
           }else{
               row--;
           }
       }
       return false;
    }
}
