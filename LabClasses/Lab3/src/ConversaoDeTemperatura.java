/**
 * ConversaoDeTemperatura
 */
public class ConversaoDeTemperatura {
  public static double celsiusToFahrenheit(double temperature) {
    return ((9.0/5.0) * temperature) + 32;
  }
  public static double celsiusToKelvin(double temperature) {
    return temperature + 273.15;
  }
  public static double fahrenheitToCelsius(double temperature) {
    return (5.0/9.0) * (temperature - 32);
  }
  public static double fahrenheitToKelvin(double temperature) {
    return (5.0/9.0) * (temperature + 459.67);
  }
  public static double kelvinToFahrenheit(double temperature) {
    return ((9.0/5.0) * temperature) - 459.67;
  }
  public static double kelvinToCelsius(double temperature) {
    return temperature - 273.15;
  }
}