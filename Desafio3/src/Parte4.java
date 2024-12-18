import java.util.Scanner;

public class Parte4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parte 4");
        System.out.println("Tabuada: ");
        int numero = 0;
        System.out.println("Digite um número para saber a tabuada: ");
        numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero);

        for (int i = 0; i < 11; i++) {
            System.out.println("\n" + numero + " x " + i + " = " + numero * i);
        }
    }
}
