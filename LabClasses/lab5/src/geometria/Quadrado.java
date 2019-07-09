package geometria;

public class Quadrado extends Poligono {
  public Quadrado(double ...args) {
    super("quadrado", args);
  }

  @Override
  public double getArea() {
    return this.getLados()[0] * this.getLados()[0];
  }

  @Override
  public double getPerimetro() {
    return 4 * this.getLados()[0];
  }
}