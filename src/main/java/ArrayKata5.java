import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Delete an element from Array using collections
 */
public class ArrayKata5 {

    public static void main(String[] args) {

        String[] arrayS = {"Red", "Green", "Blue"};
        List<String> stringList = new ArrayList(Arrays.asList(arrayS)); // convierte el array a lista
        stringList.remove(2);
        stringList.remove("Green");
        System.out.println(stringList);


    }
}
