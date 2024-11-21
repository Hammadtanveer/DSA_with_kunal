import java.util.Scanner;

public class week_weekend_day {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
//
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("week day");
//                break;
//            case 6 :
//            case 7:
//                System.out.println("weekend day");
//                break;
//            default:
//                System.out.println("invalid");
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("week day");
            case 6, 7 -> System.out.println("weekend day");
            default -> System.out.println("invalid");
        }
        
    }
}
