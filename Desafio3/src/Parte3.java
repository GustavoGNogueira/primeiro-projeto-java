import java.util.Scanner;

public class Parte3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parte 3");
        System.out.println("Menu: ");
        System.out.println("1.Calcular área do quadrado");
        System.out.println("2.Calcular área do circulo");
        int opcao = 0;
        System.out.println("Escolha a opção: ");
        opcao = scanner.nextInt();
        if (opcao == 1){
            double lado1 = 0;
            System.out.println("Digite o comprimeto do lado do quadrado: ");
            lado1 = scanner.nextDouble();
            System.out.printf("A área do quadrado é %.2f%n", lado1 * lado1);
        } else if (opcao == 2) {
            double raio = 0;
            System.out.println("Digite o raio do circulo: ");
            raio = scanner.nextDouble();
            System.out.printf("A área do circulo é %.2f%n", 3.14 * (raio * raio));
        }else {
            System.out.println("Apenas as opções 1 e 2");
        }

    }
}
