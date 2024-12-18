import java.util.Scanner;

public class loopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        double somaNotas = 0;

        while ( nota != -1 ){
            System.out.println("Digite as notas ou -1 para encerrar: ");
            nota = scanner.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                somaNotas++;
            }
        }
        System.out.printf("A media das notas é %.2f%n" ,mediaAvaliacao/somaNotas);
    }
}
