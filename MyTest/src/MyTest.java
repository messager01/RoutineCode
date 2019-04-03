import java.util.Arrays;
import java.util.Scanner;

public class MyTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int[][] arr = new int[row][4];
        for(int i = 0;i <row;i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
            arr[i][2]=scanner.nextInt();
            arr[i][3]=scanner.nextInt();
        }
        getResult(arr,row);
    }

    public static void getResult(int[][] arr,int n){
        for(int i = 0;i<n;i++){
            int count = 0;
            count+=arr[i][3];
            if(arr[i][2] <= arr[i][0]){
                count+=arr[i][2];
                arr[i][0] = arr[i][0] - arr[i][2];
            }
            if(arr[i][2] > arr[i][0]){
                count+= arr[i][0];
                arr[i][2] = arr[i][2] - arr[i][0];
            }
            if(arr[i][1]%2==0){
                count = count + arr[i][1]/2;
            }
            if(arr[i][1]%2!=0){
                count = count +(arr[i][2])/2;
            }
            if(arr[i][0] >=2){
                count++;
                arr[i][0]-=2;
            }
            if(arr[i][0]>=4){
                count = count + arr[i][0]/4;
            }
            System.out.println(count);
        }

    }
}