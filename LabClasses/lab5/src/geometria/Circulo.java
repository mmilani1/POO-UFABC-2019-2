package geometria;

public class Circulo extends FiguraPlana{
  private double PI = Math.PI;
  private double raio;

  public Circulo(double raio) {
    super("circulo");
    this.raio = raio;
  }

  public double getRaio() {
    return raio;
  }
  
  @Override
  public double getArea() {
    return PI * this.raio * this.raio;
  }

  @Override
  public double getPerimetro() {
    return 2 * PI * this.raio;
  }
}