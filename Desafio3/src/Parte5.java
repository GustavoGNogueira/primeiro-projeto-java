import java.util.Scanner;

public class Parte5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parte 5");
        System.out.println("Verifica se é par ou impar: ");
        int numero = 0;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        }else {
            System.out.println("O número " + numero + " é impar");
        }
    }
}
