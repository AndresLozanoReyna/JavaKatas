/***
 * Reverse a String
 */
public class Kata9 {

    public static void main(String[] args) {


        System.out.println(reversedMethod("voyavoltearteesta"));
        System.out.println(reversedMethod("yestatmb"));

    }

    public static String reversedMethod(String name) {
        String nameReversed = "";
        for (int i = name.length(); i > 0; i--) {
            nameReversed = nameReversed.concat(Character.toString(name.charAt(i - 1)));
        }
        return nameReversed;


    }
}

