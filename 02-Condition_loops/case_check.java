import java.util.Scanner;

public class case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String word = in.nextLine();
        char ch = in.next().trim().charAt(0);

        if (ch>='a' && ch<='z') {
            System.out.println("Lower case");
        }
        else {
            System.out.println("Uppar case");
        }
        System.out.println(ch);
    }
}
