import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of element in array  ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println("enter the target element");
        int target = in.nextInt();
        int ans = l_search(arr, target);
        if (ans ==-1) {
            System.out.println("element not found");
        }
        if(ans>0) {
            int found= arr[ans];
            System.out.println("element found at index : " + ans);
            System.out.println(" Target elemnt is :"+ found);
        }
        int found= arr[ans];

    }
    static int l_search(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        //for loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element== target)
            {
             return i;
            }

        }
        return -1;
    }
}