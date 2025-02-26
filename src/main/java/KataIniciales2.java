import java.util.Scanner;

public class KataIniciales2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scan.nextInt();


        while (numero < 0) {
            System.out.println("Ingrese un numero entero");
            numero = scan.nextInt(); // volver a guardar el valor de mi numero

        }
        if (numero >= 0) {
            System.out.println("El numero es positivo");
        }
        //holagir
    }
}


