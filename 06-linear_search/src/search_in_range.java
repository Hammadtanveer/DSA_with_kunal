import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class search_in_range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of element in the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("enter the target number; ");
        int target = in.nextInt();
        System.out.println("enter the range ");
        int lb = in.nextInt();
        int ub = in.nextInt();

        int ans = search(arr, target, lb, ub);
        System.out.println("found at index :" + ans);

    }



        static int search(int[] arr,int target ,int lb,int ub) {
            if (arr.length == 0) {
                return -1;
            }

            for (int i = lb; i <= ub; i++) {
                if (arr[i] == target) {
                    return i;

                }

            }

            return -1;
        }



    }

