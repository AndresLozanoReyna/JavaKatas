import java.util.Arrays;
import java.util.stream.IntStream;

/***
 * How to delete an element from Array in Java using Stream
 */
public class ArrayKata4 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Array= " + Arrays.toString(numbers));
        int index = 3;
        int[] newArray = IntStream.range(0, numbers.length).filter(i -> i != index).map(i -> numbers[i]).toArray();
        System.out.println("Original Array after Deletion = " + Arrays.toString(newArray));


    }
}
