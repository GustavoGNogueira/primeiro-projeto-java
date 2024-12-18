//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Condicionais: ");
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.5;
        String tipoPlano = "plus";

        if ( anoDeLancamento >= 2022 ){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        System.out.println();

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }


    }
}