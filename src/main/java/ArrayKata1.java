import java.util.Scanner;

public class ArrayKata1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // para llamar la
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the elements");
            array[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Printing the elements in the array : " + array[i]);

        }
    }
}
