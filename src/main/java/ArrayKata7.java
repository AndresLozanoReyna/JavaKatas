import java.util.Arrays;

/***
 * Find second largest element in the array
 */
public class ArrayKata7 {

    public static void main(String[] args) {
        int[] array = {1, 20, 5, 6, 16, 10};
        Arrays.sort(array);
        System.out.println("First highest element in the array = " + array[array.length - 1]);
        System.out.println("Second highest element in the array = " + array[array.length - 2]);

    }
}
