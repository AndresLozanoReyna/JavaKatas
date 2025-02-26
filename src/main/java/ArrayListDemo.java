import java.util.ArrayList;
import java.util.List;

/***
 * Convert Arrays to ArrayLists.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue"};

        // -> This is the 1st method
        //  List list = Arrays.asList(colors); // this return a list.
        //  System.out.println(list);

        //-> This is the 2nd method
        List<String> l = new ArrayList<>();
        //  Collections.addAll(l, colors);
        //  System.out.println(l);

        // -> this is three method needs the empty array
        for (String string : colors) {
            l.add(string);
        }
        System.out.println(l);
    }

}
