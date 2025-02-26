import java.util.Arrays;

/***
 * Delete element from array in Java
 */
public class ArrayKata6 {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(firstArray));
        int index = 2;
        int[] newArray = new int[firstArray.length - 1];

        for (int i = 0, k = 0; i < firstArray.length; i++) {
            if (i == index) {
                continue;

            }
            newArray[k++] = firstArray[i];
        }
        System.out.println("Original Array: " + Arrays.toString(newArray));

    }
}
