
import java.util.Scanner;

public class FRUITS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit =in.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of the fruits");
                break;
            case "apple":
                System.out.println("doctors favorite");
                break;
            case "orange":
                System.out.println("round ");
                break;
            default:
                System.out.println("invalid ");
                break;
        }
    }
}
