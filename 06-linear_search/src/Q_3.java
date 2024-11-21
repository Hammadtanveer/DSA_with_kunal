

//find minimum number in the array
public class Q_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,2,4,66,-11};

        System.out.println(min(arr));
    }

    static int min (int[] arr) {
        int ans = arr[0];
        for (int i= 0; i < arr.length; i++) {
            if (ans > arr[i]) {
                ans = arr[i];
            }
        }
        return ans;


            }

        }


