public class order_agnostic_bsearch {
    public static void main(String[] args) {
//        int[] arr = {-11,-6,0,22,33,44,55,66,77,88,99};
        int[] arr ={99,88,77,66,55,44,33,22,11};
        int target = 22;
        int ans = oradbs(arr,target);
        System.out.println(ans);

    }
    static int oradbs (int[]arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean Asc = arr[start]<arr[end];


        while(start<=end){
            int mid = start +(end-start)/2;


            if (arr[mid] == target) {
                return mid;
            }

            if (Asc) {
                if(target<arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }

            } else {
                if(target>arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;

    }
}
