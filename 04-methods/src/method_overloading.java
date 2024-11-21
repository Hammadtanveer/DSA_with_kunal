public class method_overloading {

    public static void main(String[] args) {

        fun(10);
        fun(11,20);


    }

    static void fun(int a, int b) {
        System.out.println(a+ " " +b);

    }

    static void fun(int a) {
        System.out.println(a);

    }
}
