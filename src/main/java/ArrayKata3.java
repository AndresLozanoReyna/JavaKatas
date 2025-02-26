/***
 * Find the first duplicate ocurrance of a number in an array
 */

public class ArrayKata3 {

    public static void main(String[] args) {

        // creating the array
        Integer[] arrayNumbers = {1, 2, 0, 3, 4, 5, 6, 7, 3};

        // Loop the elements from the first element
        for (int i = 0; i < arrayNumbers.length; i++) {

            // Loop the elements from the second
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] == arrayNumbers[j]) {
                    System.out.println(arrayNumbers[i]);
                    return;
                }
            }
        }


    }
}
