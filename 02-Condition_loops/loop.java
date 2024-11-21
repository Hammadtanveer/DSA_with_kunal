// print number from 1 to 5
import java.util.Scanner;
public class loop {

    public static void main(String[] args) {
//        int i =0;
//        while (i<6){
//            System.out.println(i);
//            i++;
//        }
//    }
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
        for (int i = 0; i <n+1; i++) {
            System.out.print(i + " ");
        }


    }
}
