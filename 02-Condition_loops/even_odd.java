import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = Input.next();
        System.out.println("please enter your roll_number");
        long roll_number = Input.nextLong();
        System.out.println("your good name is "+ name);
        System.out.println("your roll_number is "+ roll_number);
    }
}
