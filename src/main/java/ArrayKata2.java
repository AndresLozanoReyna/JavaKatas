import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Check whether elements is present in two arrays in given 3 arrays
 */
public class ArrayKata2 {

    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {5, 6, 7, 8, 9};
        Integer[] array3 = {1, 9, 10, 15, 4};

        HashSet<Integer> h = new HashSet<>();
        List<Integer> l1 = Arrays.asList(array1);
        List<Integer> l2 = Arrays.asList(array2);
        List<Integer> l3 = Arrays.asList(array3);
        h.addAll(l1);
        h.addAll(l2);
        h.addAll(l3);

        List<Integer> finalList = new ArrayList<Integer>();

        for (Integer number : h) {

            if ((l1.contains(number) && l2.contains(number)) ||
                    (l2.contains(number) && l3.contains(number)) ||
                    (l3.contains(number) && l1.contains(number))) {
                finalList.add(number);
            }


        }
        System.out.println(finalList);

    }
}
