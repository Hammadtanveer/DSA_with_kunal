import java.util.Arrays;
import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {

            for (int coll = 0; coll < arr[row].length; coll++) {
                arr[row][coll] = in.nextInt();
            }
//        }
//        for (int row = 0; row< arr.length; row++) {
//            for (int coll = 0; coll < arr[row].length; coll++) {
//                System.out.print(arr[row][coll]+" ");
//
//           }

            for (row = 0; row< arr.length; row++){
                System.out.println(Arrays.toString(arr[row]));}
        }
    }
}

