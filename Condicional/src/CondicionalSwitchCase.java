public class CondicionalSwitchCase {
    public static void main(String[] args) {
        int dia = 2;
        String nomeDia = "Valor";

        switch ( dia ) {
            case 1:
                nomeDia = "Domingo";
            break;

            case 2:
                nomeDia = "Segunda";
            break;

            case 3:
                nomeDia = "Terça";
            break;

            case 4:
                nomeDia = "Quarta";
            break;

            case 5:
                nomeDia = "Quinta";
            break;

            case 6:
                nomeDia = "Sexta";
            break;

            case 7:
                nomeDia = "Sabado";
            break;
        }
        System.out.println("O " + dia + " da semana se chama " + nomeDia);
    }
}
