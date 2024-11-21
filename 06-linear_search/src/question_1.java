import java.util.Scanner;
//Search in string
public class question_1 {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        char target = 'd';


        boolean ans = search(name, target);
        System.out.println(ans);
    }


        static boolean search(String name, char target){
        if(name.length() == 0){
            return false;}

        for (int i = 0; i < name.length(); i++) {
            if (target ==name.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
