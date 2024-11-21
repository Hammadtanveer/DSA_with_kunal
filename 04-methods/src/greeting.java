import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name ;");

        String name = in.next();
        String massege = greet(name);
        System.out.println(massege);

    }
    static String greet(String name){
        //        System.out.println("now");
        return "hello " + name;
    }

}
