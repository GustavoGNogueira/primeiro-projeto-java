//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Parte 1");
        System.out.println("Média de duas notas: ");
        double n1 = 8.5;
        double n2 = 9.5;
        double media = ( n1 + n2 ) /2;
        System.out.println("A media entre as notas " + n1 + " e " + n2 + " é " + media);

        System.out.println();

        System.out.println("Parte 2");
        System.out.println("Concatenação: ");
        String nome = "Gustavo";
        char sexo = 'M';
        System.out.println("O sexo do paciente " + nome + " é " + sexo);

        System.out.println();

        System.out.println("Parte 3");
        System.out.println("Casting: ");
        double a = 9.5;
        int b = (int) a;
        System.out.println("Valor normal: " + a);
        System.out.println("Valor convertido para inteiro: " + b);

        System.out.println();

        System.out.println("Parte 4");
        System.out.println("Valor total dos produtos: ");
        double precoProduto = 10.5;
        int quantidade = 100;
        double valorTotal = (precoProduto * quantidade);
        System.out.println("Preço do produto: " + precoProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: " + valorTotal);

        System.out.println();

        System.out.println("Parte 5");
        System.out.println("Valor em dolares: ");
        double valorEmDolares = 100.50;
        double conversao = (valorEmDolares * 4.94);
        double valorEmReal = conversao;
        System.out.println("Valor em dolar: $ " + valorEmDolares);
        System.out.println("Valor em real: R$ " + valorEmReal);

        System.out.println();

        System.out.println("Parte 6");
        System.out.println("Desconto no preço: ");
        double precoOriginal = 100;
        double percentualDesconto = 0.10;
        double desconto = (precoOriginal - (precoOriginal * percentualDesconto));
        double precoFinal = desconto;
        System.out.println("Preço original: R$ " + precoOriginal);
        System.out.println("Desconto de 10%");
        System.out.println("Preço final: R$ " + precoFinal);


    }
}