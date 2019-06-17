import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    double temperature;
    int convertion;

    System.out.println("Digite a temperatura que quer converter");
    temperature = scan.nextDouble();

    System.out.println("Escolha a conversão. Digite o número correspondente a sua escolha:");
    System.out.println("Celsius para Fahrenheit: 1;\n"
                      + "Celsius para Kelvin: 2;\n"
                      + "Fahrenheit para Celsius: 3;\n"
                      + "Fahrenheit para Kelvin: 4;\n"
                      + "Kelvin para Celsius: 5;\n" 
                      + "Kelvin para Fahrenheit: 6;\n");
    convertion = scan.nextInt();

    switch (convertion) {
      case 1:
        printResult(ConversaoDeTemperatura.celsiusToFahrenheit(temperature));
        break;
      case 2:
        printResult(ConversaoDeTemperatura.celsiusToKelvin(temperature));
        break;
      case 3:
        printResult(ConversaoDeTemperatura.fahrenheitToCelsius(temperature));
        break;
      case 4:
        printResult(ConversaoDeTemperatura.fahrenheitToKelvin(temperature));
        break;
      case 5:
        printResult(ConversaoDeTemperatura.kelvinToCelsius(temperature));
        break;
      case 6:
        printResult(ConversaoDeTemperatura.kelvinToFahrenheit(temperature));
        break;
      default:
        System.out.println("Ação inválida");
        break;
    }
  }

  private static void printResult(double value) {
    System.out.printf("O valor convertido é: %.2f\n", value);
  }
}