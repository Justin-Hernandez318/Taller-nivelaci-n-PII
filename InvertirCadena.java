import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=== INVERSOR DE CADENA ===");

        System.out.print("Ingrese un texto: ");
        String texto = teclado.nextLine();

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);

        teclado.close();
    }
}
