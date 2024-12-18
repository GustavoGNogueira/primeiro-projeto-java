import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parte 1");
        System.out.println("Verifica se é positivo ou negativo: ");
        int n = 0;
        System.out.println("Digite um número: ");
        n = scanner.nextInt();
        if (n > 0){
            System.out.println("O número " + n + " é positivo");
        }else {
            System.out.println("O número " + n + " é negativo");
        }
        
    }
}