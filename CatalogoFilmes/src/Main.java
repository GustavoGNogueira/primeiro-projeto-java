//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int anoDeLancamento = 2024; // variável que armazena o ano de lançamento
        double notaAvaliacao1 = 9.9; // variável que armazena a nota do primeiro crítico
        double notaAvaliacao2 = 10; // variável que armazena a nota do segundo crítico
        double notaAvaliacao3 = 9.5; // variável que armazena a nota do terceiro crítico
        double media = ( notaAvaliacao1 + notaAvaliacao2 + notaAvaliacao3 ) / 3; // calcula a média entre as três notas
        int classificacao = (int) ( media / 2 ); // calcula o resultado da media dividido por dois e transforma em inteiro

        System.out.println("Bem-Vindo ao CineStream");
        System.out.println("=======================");
        System.out.println("Filme: Velozes e Furiosos");
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Nota do primeiro crítico: " + notaAvaliacao1);
        System.out.println("Nota do segundo crítico: " + notaAvaliacao2);
        System.out.println("Nota do terceiro crítico: " + notaAvaliacao3);
        System.out.printf("Media das notas: %.2f\n ", media);
        System.out.println("Quantidade de estrelas: " + classificacao);
        System.out.println("=======================");

    }
}