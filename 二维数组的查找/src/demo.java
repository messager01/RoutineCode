public class demo {
    public boolean searchArray(int[][] arr,int n){
        int column = 0;
        int row = arr.length-1;
        while(column <arr[0].length && row >=0){
            if(n==arr[row][column]){
                return true;
            }else if(arr[row][column]>n){
                row--;
            }else{
                column++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        demo demo = new demo();
        boolean b = demo.searchArray(ints, 5);
        System.out.println(b);
    }
}
