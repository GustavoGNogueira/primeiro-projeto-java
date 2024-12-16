//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double temperaturaCelsius = 18.5; // variável que armazena uma temperatura em celsius
        double conversor = (temperaturaCelsius * 1.8 ) + 32; // variável que converte celsius para fahrenheit
        int temperaturaFahrenheit = (int) (conversor); // casting mudando de double para int

        System.out.println("Sistema que converte Celsius para Fahrenheit");
        System.out.println("============================================");
        System.out.println("Temperatura em celsius: " + temperaturaCelsius + " C ");
        System.out.println("Temperatura em fahrenheit: " + temperaturaFahrenheit + " F ");

    }
}