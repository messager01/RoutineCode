public class RotatingArray {
    public static int getMinNumberInRotatingArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        //如果旋转数组旋转了0位，即旋转数组是其本身
        if(arr[start]<arr[end]){
            return arr[start];
        }
        while(start<=end){
            //不建议写mid= (start+end)/2   可能会内存溢出
            int mid = start+((end-start)/2);
            //考虑到1,0,1,1,1   二分查找会错过最小解   顺序查找
            if(arr[mid] == arr[start]&& arr[start] == arr[end]){
                return getMins(arr);
            }
            if(arr[mid] >= arr[start]){
                start = mid;
            }else{
                end = mid;
            }
            if(start == end-1){
                break;
            }
        }
        return arr[end];
    }
    public static int getMins(int[] arr){
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,1,1};
        int number = RotatingArray.getMinNumberInRotatingArray(arr);
        System.out.println(number);
    }
}
