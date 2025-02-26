import java.util.Scanner;

public class KataIniciales {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = 0;// Aqui guardamos la variable
        boolean condicion = true;

        while (condicion) {
            try {
                System.out.println("Porfavor Ingrese un numero:");
                numero = Integer.parseInt(scan.nextLine());
                condicion = false;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero correcto no sea mamon");
            }
        }

        if (numero == 0) {
            System.out.println("El numero ingresado es neutro: " + numero);
        } else if (numero > 0) {
            System.out.println("El numero ingresado es positivo: " + numero);
        } else {
            System.out.println("El numero ingresado es negativo: " + numero);
        }

    }

}



