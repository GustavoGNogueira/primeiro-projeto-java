import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as notas do filme: ");
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.printf("A media das notas de avaliação é: %.2f%n" ,mediaAvaliacao/3);
    }
}
