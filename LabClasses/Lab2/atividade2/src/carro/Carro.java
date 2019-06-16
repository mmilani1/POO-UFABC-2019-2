package carro;

public class Carro {
  private String model;
  private String fuelType;
  private double fuelAmount;
  private double efficiency;

  public Carro(String model, String fuelType, double efficiency){
    this.model = model;
    this.fuelType = fuelType;
    this.efficiency = efficiency;
  }

  public String getFuelType() {
    return fuelType;
  }

  public String getModel() {
    return model;
  }
  
  public double getEfficiency() {
    return efficiency;
  }

  public double getFuelAmount() {
    return this.fuelAmount;
  }

  public void putFuel(double amount) {
    this.fuelAmount += amount;
  }

  public double fuelNeeded(double travelDisntace) {
    return travelDisntace/efficiency;
  } 

  public boolean canTravel(double distance) {
    if(this.fuelAmount < fuelNeeded(distance)) return false;

    return true;
  }

  public int travel(double distance) {
    if(this.fuelAmount < fuelNeeded(distance)) return -1;

    this.fuelAmount -= fuelNeeded(distance);
    return 1;
  }
}