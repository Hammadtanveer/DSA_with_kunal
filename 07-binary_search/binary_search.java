public class binary_search {
    public static void main(String[] args) {
        int[] arr = {-11,-6,0,22,33,44,55,66,77,88,99};
        int target = -11;
        int ans = binary_Search(arr,target);
        System.out.println(ans);
    }
    static int binary_Search (int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
             end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
