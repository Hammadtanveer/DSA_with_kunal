import java.util.Scanner;

public class Dayname {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("thusday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thusday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("invalid");
//
//            switch (day){
//                case 1:
//                    System.out.println("monday");
//                    break;
//                case 2:
//                    System.out.println("thusday");
//                    break;
//                case 3:
//                    System.out.println("wednesday");
//                    break;
//                case 4 :
//                    System.out.println("thusday");
//                    break;
//                case 5:
//                    System.out.println("friday");
//                    break;
//                case 6 :
//                    System.out.println("saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                default:
//                    System.out.println("invalid");
//            }

        }
    }
}
