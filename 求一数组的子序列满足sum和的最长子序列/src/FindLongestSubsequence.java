import java.util.HashMap;

public class FindLongestSubsequence {
    /**
     * 给定一个数组  由正数  0  负数组成   给定sum  sum是某一子序列的和
     * 求满足该子序列的最长子序列的长度
     */
    //k即为给定的sum
    public static int findLongsetSubsequence(int[] arr,int k){
        if(arr == null || arr.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,-1);
        int sum = 0;   //sum为数组前i项的和
        int len = 0;  //最长子序列的长度
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            if(hashMap.containsKey(sum-k)){
                if( hashMap.get(sum-k)==-1)
                len = i- hashMap.get(sum-k);
                else{
                    len = i- hashMap.get(sum-k)+1;
                }
            }
            if(!hashMap.containsKey(sum)){
                hashMap.put(sum,i);
            }
        }
        return len;
    }


    public static void main(String[] args) {
        int arr[]={-2,3,-1,4,1,8};
        int sum=5;
        int i = FindLongestSubsequence.findLongsetSubsequence(arr, sum);
        System.out.println(i);
    }
}
