import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parte 2");
        System.out.println("Comparação entre números: ");
        int n1 = 0;
        int n2 = 0;
        System.out.println("Digite o primeiro valor: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = scanner.nextInt();
        if (n1 == n2){
            System.out.println("Os números são iguais");
        } else if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior que " + n2);
        }else {
            System.out.println("O número " + n2 + " é maior que " + n1);
        }
    }
}
