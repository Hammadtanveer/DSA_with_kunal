import java.util.Scanner;

public class armstrong_3d {
    public static boolean main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int orignal = n;
        int sum = 0;


    static boolean armstrong(int n){
            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                sum = sum + rem * rem * rem;

            }
            if (sum == orignal) {
             return true;
        }

    }
    }

}
