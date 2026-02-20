import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CALCULADORA BÁSICA ===");

        System.out.print("Ingrese el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = teclado.nextInt();

        double resultado;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        teclado.close();
    }
}

