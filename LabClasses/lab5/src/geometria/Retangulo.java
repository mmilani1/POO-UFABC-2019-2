package geometria;

public class Retangulo extends Poligono {
  public Retangulo(double ...args) {
    super("retangulo", args);
  }

  @Override
  public double getArea() {
    return this.getLados()[0] * this.getLados()[1];
  }

  @Override
  public double getPerimetro() {
    return 2 * (this.getLados()[0] + this.getLados()[1]);
  }
}