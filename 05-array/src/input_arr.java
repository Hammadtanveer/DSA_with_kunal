import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class input_arr {
    public static void main(String[] args) {out.println();
        out.println("enter the rool number : ");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println("given arr = :");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");

        }
        out.println();
        System.out.println(Arrays.toString(arr));
    }
}
