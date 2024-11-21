import java.util.ArrayList;
import java.util.Scanner;

public class arraylistex {
    public static void main(String[] args) {
        System.out.println("enter the value of n :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("enter the value for arraylist :");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());

        }
        System.out.println(list);
    }
}
