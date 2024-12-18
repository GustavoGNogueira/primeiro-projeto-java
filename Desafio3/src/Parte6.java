import java.util.Scanner;

public class Parte6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parte 6");
        System.out.println("Fatorial: ");
        int numero = 0;
        int fatorial = 1;
        System.out.println("Digite um número para saber o fatorial: ");
        numero = scanner.nextInt();
        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
