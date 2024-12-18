import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner (System.in); // crição de um objeto da classe Scanner para receber dados

        System.out.println("Dados Pessoais: ");
        System.out.println("Digite seu nome: ");
        String nome = Leitura.nextLine(); // Lê o nome digitado pelo usuário e o armazena na variável
        System.out.println("Digite sua idade: ");
        int idade = Leitura.nextInt(); // Lê a idade digitada pelo usuário e o armazena na variável
        Leitura.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = Leitura.nextLine(); // Lê o endereço digitado pelo usuário e o armazena na variável

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }
}
