// Utilizamos la librería Scanner para leer entrada del usuario
import java.util.Scanner;

// La clase pública se llama "operaciones"
public class operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables para almacenar los números
        double num1, num2;

        // Le pedimos al usuario los números
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        // Validar que los números sean positivos y no sean cero
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Error: Los números deben ser positivos y diferentes de cero.");
        } else {
            // Para verificar si un número es múltiplo del otro, ambos deben ser enteros
            if (num1 % num2 == 0) {
                System.out.println(num1 + " es múltiplo de " + num2);
            }
            else if (num2 % num1 == 0) {
                System.out.println(num2 + " es múltiplo de " + num1);
            }
            else {
                System.out.println("Ninguno de los números es múltiplo del otro.");
            }
        }

        // Cerramos el Scanner para liberar recursos
        scanner.close();
    }
}