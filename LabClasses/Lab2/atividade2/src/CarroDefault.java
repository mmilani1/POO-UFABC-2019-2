import carro.*;
import java.util.Scanner;

public class CarroDefault {
  public static void main(String[] args) {
    Carro fit = new Carro("Fit", "Gasolina", 10.5);
    Carro corolla = new Carro("Corolla", "Gasolina", 8.9);
    Carro s10 = new Carro("S10", "Diesel", 13.2);

    fit.putFuel(50);
    corolla.putFuel(60);
    s10.putFuel(85);

    fit.travel(300);
    corolla.travel(300);
    s10.travel(300);

    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a distanca da viagem:");
    double distance = scan.nextDouble();

    carStatusByTravelDistance(fit, distance);
    carStatusByTravelDistance(corolla, distance);
    carStatusByTravelDistance(s10, distance);
  }

  private static void carStatusByTravelDistance(Carro car, double distance) {
    String model = car.getModel();
    String fuelType = car.getFuelType();
    double efficiency = car.getEfficiency();
    double fuelLevel = car.getFuelAmount();
    double fuelNeeded = car.fuelNeeded(distance);
    String canTravel = car.canTravel(distance) ? "Combustivel suficiente" : "Combustivel insuficiente";

    System.out.printf("Model: %s, fuelType: %s, Efficiency: %f, FuelLevel: %f, FuelNeeded: %f, CanTravel: %s\n", model,
        fuelType, efficiency, fuelLevel, fuelNeeded, canTravel);
    return;
  }
}