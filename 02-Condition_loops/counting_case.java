import java.util.Scanner;

public class counting_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n /= 10;
        }
            System.out.println(count);
        }
    }

