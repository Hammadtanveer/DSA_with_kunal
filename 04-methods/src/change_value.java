import java.util.Arrays;

public class change_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};
        System.out.println(Arrays.toString(arr));
        change( arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void change(int[] nums) {
        nums[0] = 99;
    }
}
